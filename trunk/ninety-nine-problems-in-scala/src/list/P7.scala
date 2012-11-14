package list

//Flatten a nested list structure.
object P7 {
	def main(args: Array[String]){
	  print(flattenList(List(List(1), 2, List(2,List(0,4,3)))))
	}
	
	def flattenList[A](list: List[A]) : List[A] ={	  
	  list.foldLeft(List[A]())((l,r) => (r match {
	  	case m :List[A] => l ++ flattenList(m)
	  	case e => l ++ List(e)
	  } ))
	}
}