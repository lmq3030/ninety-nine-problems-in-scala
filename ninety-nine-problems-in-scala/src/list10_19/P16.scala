package list10_19
//Drop every N'th element from a list.

object P16 {
	def main(args: Array[String]){
	  print(dropN(List(1,2,3,4,5,6,7), 3))
	}
	
	def dropN[A](list: List[A], n :Int): List[A] = {
	  
	  list.zipWithIndex.filter(c => (c._2 + 1)%n !=0).unzip._1
	}
}