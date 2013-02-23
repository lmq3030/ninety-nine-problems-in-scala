package list20_28
//Lotto: Draw N different random numbers from the set 1..M.

object P24 {
	def main(args : Array[String]){
	  print(randomSet(Range(1,8).toSet))
	}
	def randomSet[A](set: Set[A]): Set[A] = util.Random.shuffle(set.toList).take(util.Random.nextInt(set.size)).toSet
}