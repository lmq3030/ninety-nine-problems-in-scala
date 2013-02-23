package list20_28
//Generate a random permutation of the elements of a list.
object P25 {
	def main(args: Array[String]){
	  print(permuList(Range(1,10).toList))
	}
	
	def permuList[A](l: List[A]):List[A] = util.Random.shuffle(l)
}