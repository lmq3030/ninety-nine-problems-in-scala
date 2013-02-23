package list20_28
/*
 * Sorting a list of lists according to length of sublists
 * 
 * a) We suppose that a list contains elements that are lists themselves. 
 * The objective is to sort the elements of this list according to their length. 
 * E.g. short lists first, longer lists later, or vice versa.
 * 
 * b) Again, we suppose that a list contains elements that are lists themselves. 
 * But this time the objective is to sort the elements of this list according to their length frequency; 
 * i.e., in the default, where sorting is done ascendingly, lists with rare lengths are placed first, 
 * others with a more frequent length come later.
 * 
 */
object P28 {
	def main(args: Array[String]){
	  println(lsort(List(List(1,2), List(2,3,4), List(3,5))))
	  println(lfsort(List(List(1,2), List(2,3,4), List(3,5))))
	}
	
	def lsort[A](l:List[List[A]]) : List[List[A]] = l.map(x => (x.size, x)).sortBy(_._1).map(_._2)
	
	def lfsort[A](l:List[List[A]]) : List[List[A]] = l.groupBy(_.size).toList.sortBy(_._2.size).map(_._2).flatten
}