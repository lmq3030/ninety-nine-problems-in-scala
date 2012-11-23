package list10_19
//Duplicate the elements of a list.
object P14 {
  def main(args: Array[String]) {
  	print(dupList(List(1,2,2,3,4,5,5)))
  }

  def dupList[A](list: List[A]): List[A] = {
    list match {
      case Nil => list
      case x :: xs => x :: x :: dupList(xs)
    }
  }
}