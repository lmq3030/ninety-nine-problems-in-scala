package list10_19
//(**) Extract a slice from a list.

//Given two indices, i and k, the slice is the list containing the elements between the i'th and k'th element of the original list (both limits included). 
//Start counting the elements with 1.
object P18 {
  def main(args: Array[String]): Unit = {
    print(extract(List(1,2,3,4,5,6,7), 2,5))
  }
  
  def extract[A](list: List[A], start: Int, end:Int) : List[A] = start match {
    case 0 => end match {
      case   0 => Nil
      case _ => list.head :: extract(list.tail, 0, end-1)
    }
    case _ => extract(list.tail, start-1, end-1)
  }

}