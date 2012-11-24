package list10_19
//(**) Decode a run-length encoded list.
//Given a run-length code list generated as specified in problem 11. Construct its uncompressed version.

object P12 {
  def main(args: Array[String]) {
    print(decodeList(List(1, (2, 2), (2, 3), (2, 4), (3, 5), 6, (2, 7), 8, (2, 9))))
  }

  def decodeList(list: List[Any]): List[Any] = {
    list.map {
      case (x: Int, y) => List.fill(x)(y)
      case x => List(x)
    }.flatten
  }
}