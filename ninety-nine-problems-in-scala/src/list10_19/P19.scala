package list10_19
//Rotate a list N places to the left.
object P19 {

  def main(args: Array[String]): Unit = {
    print(rotateN(List(1,2,3,4,5,6,7), 3))
    
  }

  def rotateN[A](list:List[A], n: Int) : List[A] ={
    val len = list.length
    val (left,right) = list.splitAt((len+n)%len)
    right++left
  }
}