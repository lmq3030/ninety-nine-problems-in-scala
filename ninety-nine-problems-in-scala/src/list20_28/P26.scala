package list20_28

/*
 * Generate the combinations of K distinct objects chosen from the N elements of a list

* In how many ways can a committee of 3 be chosen from a group of 12 people? *
* We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficients). 
* For pure mathematicians, this result may be great. But we want to really generate all the possibilities in a list.
 */

object P26 {
	def main(args:Array[String]){
	  print(combin(List(1,2,3,4),2))
	}
	
	def combin[A](l:List[A], n:Int):List[List[A]] = 
	  if (n == 0) List(List())
	  else if (l.size <= n) List(l)
	  else combin(l.tail, n-1).map(l.head::_) ++ combin(l.tail, n)
}