package list10_19
//(**) Replicate the elements of a list a given number of times.
object P15 {
	def main(args: Array[String]){
	  print(repList(List(1,2,4,3),2))
	}
	
	def repList[A](list: List[A], n: Int) : List[A] ={
			def repListRec(list: List[A], temp:Int): List[A] ={
			  list match{
			    case Nil => Nil
			    case x::xs => temp match {
			      case 0 => repListRec(xs, n)
			      case _ => x:: repListRec(x::xs, temp-1)
			    }
			  }
			}
			
			repListRec(list, n)
	}
  
  
}