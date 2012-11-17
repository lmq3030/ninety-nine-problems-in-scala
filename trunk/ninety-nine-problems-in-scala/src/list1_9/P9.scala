package list1_9
//Pack consecutive duplicates of list elements into sublists. 
//If a list contains repeated elements they should be placed in separate sublists.
object P9 {
	def main(args: Array[String]){
	  println(dupSubList(List(1,2,2,3,3,4,4,5,5,5,6,7,7,8,9,9)))
	}
	
	def dupSubList[A](list : List[A]) : List[List[A]] = {
	  
	  def dupRec[A](list: List[A], ele: A, count: Int, updatedList: List[List[A]]) : List[List[A]] = {
	    list match {
	      case Nil => List.fill(count)(ele)::updatedList
	      case x::xs => 	if (ele == x) 
	        								dupRec(xs, ele, count+1, updatedList)
	      							else {
	      							  val newUpdatedList = List.fill(count)(ele)::updatedList
	      							  dupRec(x::xs, x, 0, newUpdatedList)
	      							} 
	    }
	  }
	  
	  dupRec(list, list.head, 0, List()).reverse
	  
	}
}