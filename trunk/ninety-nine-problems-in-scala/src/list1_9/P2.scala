package list1_9
//Find the last but one element of a list.
object P2 {
  def main(args: Array[String]) {
    println(butLast(List(1, 2, 3)))
    println(butLast(List(1))) // expect exception
    println(butLast(List())) // expect exception

  }

  def butLast[A](list: List[A]): A = {
    list match {
      case x :: y :: Nil => x
      case x ::xs => butLast( xs)
      case _ => throw new Exception("list length < 2")
    }
  }

}