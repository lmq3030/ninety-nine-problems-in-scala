package list20_28
// Insert an element at a given position into a list.
object P21 {

  def main(args: Array[String]): Unit = {
    print(insertAt(List(1,2,3,5,6),4,3))
    
  }
  
  def insertAt[A](list: List[A], ele: A, n:Int) : List[A] = n match {
    case 0 => ele::list
    case _ => list.head :: insertAt(list.tail, ele, n-1)
  } 
}