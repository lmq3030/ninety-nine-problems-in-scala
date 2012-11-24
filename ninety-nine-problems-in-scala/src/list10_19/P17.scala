package list10_19
//(*) Split a list into two parts; the length of the first part is given.

//Do not use any predefined predicates.
object P17 {

  def main(args: Array[String]): Unit = {
    print(splitAtN(List(1,2,3,4,5,6,7),3))
  }
  
  def splitAtN[A](list: List[A], n: Int): (List[A], List[A]) ={
    def splitAtNRec[A](bef: List[A], after: List[A], n: Int): (List[A], List[A]) = {
      n match {
        case 0 => (bef, after)
        case _ => splitAtNRec(after.head::bef, after.tail, n-1)
      }
    }
    
    val (bef, after)= splitAtNRec(Nil, list, n)
    (bef.reverse,after)
  }

}