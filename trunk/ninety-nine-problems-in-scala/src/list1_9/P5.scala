package list1_9
//Reverse a list
object P5 {
  def main(args: Array[String]){
    println(revList(List(1,2,3,4)))
    println(revList(List(1)))
  }
  
  def revList[A](list: List[A]) : List[A] = {
    list.foldLeft(List[A]())( (l,r) => r :: l)
  }
}