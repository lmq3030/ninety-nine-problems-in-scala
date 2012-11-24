package list1_9
//Find the last element of a list.
object P1 {
  def main(args: Array[String]) {
    print(last1(List(1, 2, 3)))
    print(last1(List()))

    print(last2(List(1, 2, 3)))
    print(last2(List()))
  }

  def last1[A](list: List[A]): A = {
    list.last
  }

  def last2[A](list: List[A]): A = {
    list match {
      case Nil => throw new Exception("empty list")
      case x :: Nil => x
      case x :: xs => last2(xs)
    }
  }

}