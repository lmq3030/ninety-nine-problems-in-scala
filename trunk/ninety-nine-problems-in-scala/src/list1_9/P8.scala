package list1_9

//Eliminate consecutive duplicates of list elements
object P8 {
  def main(args: Array[String]) {
    print(elimDup(List(1, 2, 2, 3, 4, 4, 5, 5, 5, 5)))
    print(elimDup2(List(1, 2, 2, 3, 4, 4, 5, 5, 5, 5)))
  }

  def elimDup[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil
      case x :: Nil => List(x)
      case x :: y :: xs => if (x == y) elimDup(x :: xs) else x :: elimDup(y :: xs)
    }
  }

  def elimDup2[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]())((l, r) => if (l.size > 0){ if (l.last == r) l else l ++ List(r)} else List(r))
  }
}