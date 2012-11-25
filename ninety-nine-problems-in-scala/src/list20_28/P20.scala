package list20_28
//Remove the K'th element from a list.
object P20 {
	def main(args: Array[String]){
	  print(removeK2(List(1,2,3,4,5), 2))
	}
	
	// need to visit list twice(splitAt, ++)
	def removeK[A](list: List[A], n : Int) : (A, List[A]) = {
	  val (before,e::after) = list.splitAt(n-1)
	  return(e, before++after)
	  
	}
	
	// this one only visit list once
	def removeK2[A](list: List[A], n: Int): (A, List[A]) = {
	  def removeKRec(list1:List[A], count: Int) : (A, List[A]) = count match{
	    case 1 => (list1.head, list1.tail)
	    case _ => {
	      val (l,r) = removeKRec(list1.tail, count-1)
	      (l, list1.head::r)
	    } 
	  }
	  
	  removeKRec(list, n)
	}
}