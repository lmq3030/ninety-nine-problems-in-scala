package list1_9
// Find the number of elements of a list.
object P4 {
  def main(args: Array[String]) {
    println(len(List(1, 2, 3)))
    println(len(List(1)))
    println(len(List()))

  }
  
  def len[A](list: List[A]) : Int = {
    list match {
      case Nil => 0
      case x::xs => 1 + len(xs)
    }
  }
}