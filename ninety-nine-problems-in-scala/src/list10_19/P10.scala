package list10_19

//Run-length encoding of a list. Use the result of problem P09 to implement the so-called run-length encoding data compression method. 
//Consecutive duplicates of elements are encoded as lists (N E) where N is the number of duplicates of the element E.

object P10 {
def main(args: Array[String]){
	  println(enccodeDupSubList(List(1,2,2,3,3,4,4,5,5,5,6,7,7,8,9,9)))
	}
	
	def enccodeDupSubList[A](list : List[A]) : List[(Int, A)] = {
	  
	  def dupRec[A](list: List[A], ele: A, count: Int, updatedList: List[(Int, A)]) : List[(Int, A)] = {
	    list match {
	      case Nil => (count,ele)::updatedList
	      case x::xs => 	if (ele == x) 
	        								dupRec(xs, ele, count+1, updatedList)
	      							else {
	      							  val newUpdatedList = (count,ele)::updatedList
	      							  dupRec(x::xs, x, 0, newUpdatedList)
	      							} 
	    }
	  }
	  
	  dupRec(list, list.head, 0, List()).reverse
	  
	}
}