package list20_28
//Create a list containing all integers within a given range.
object P22 {

  def main(args: Array[String]): Unit = {
    print(range(4,9))
  }

  def range(start: Int, end: Int): List[Int] ={
    List.iterate(start, end-start+1)(_+1)
  }
}