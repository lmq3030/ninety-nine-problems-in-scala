package list1_9
//Find the K'th element of a list. The first element in the list is number 1.
object P3 {
  def main(args: Array[String]) {
    println(eleAt(List(1, 2, 3), 2))
    println(eleAt(List(1), 1))

  }

  def eleAt[A](list: List[A], index: Int): A = {
    index match {
      case 0 => {
        if (list.size > 0) list.head
        else throw new Exception("Index out of bound")
      }
      case x => {
        if (list.size > 0) eleAt (list.tail, x - 1)
        else throw new Exception("Index out of bound")
      } 
    }
  }

}