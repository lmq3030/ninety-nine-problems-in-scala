package list20_28
//Extract a given number of randomly selected elements from a list.
import P20.removeK2

object P23 {
	def main(args: Array[String]){
	  print(randList((2 to 20).toList, 15))
	}
  
	def randList[A](list: List[A], n: Int): List[A] = {
	  def randListRec(list: List[A], n: Int, rand: util.Random): List[A] = n match {
	    case 0 => Nil
	    case _ => {
	      val (l,r) = removeK2(list, (rand.nextInt(list.length)+1))
	      l:: randList(r, n-1)
	    }
	  }
	  randListRec(list, n, new util.Random)
	}
}