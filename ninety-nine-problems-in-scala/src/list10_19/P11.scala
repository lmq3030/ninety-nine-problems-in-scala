package list10_19
// Modify the result of problem 10 in such a way that if an element has no duplicates it is simply copied into the result list. 
// Only elements with duplicates are transferred as (N E) lists.
object P11 {
  def main(args: Array[String]) {
    println(enccodeDupSubList(List(1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 7, 7, 8, 9, 9)))
  }

  def enccodeDupSubList[A](list: List[A]): List[Any] = {

    def dupListFlatten[A](list: List[A]): List[Either[A, (Int, A)]] = {

      def dupRec[A](list: List[A], ele: A, count: Int, updatedList: List[Either[A, (Int, A)]]): List[Either[A, (Int, A)]] = {

        def generateEle(count: Int, ele: A): Either[A, (Int, A)] = {
          count match {
            case 1 => Left(ele: A)
            case _ => Right(count, ele)
          }
        }
        list match {
          case Nil => generateEle(count, ele) :: updatedList
          case x :: xs => if (ele == x)
            dupRec(xs, ele, count + 1, updatedList)
          else {
            val newUpdatedList = generateEle(count, ele) :: updatedList
            dupRec(x :: xs, x, 0, newUpdatedList)
          }
        }
      }

      dupRec(list, list.head, 0, List()).reverse
    }

    dupListFlatten(list).map{
      case Left(x) => x
      case Right((x,y)) => (x,y)}
  }
}