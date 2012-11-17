package list1_9

//Find out whether a list is a palindrome.
object P6 {
  def main(args: Array[String]) {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
    println(isPalindrome(List(1, 2, 3, 3, 2, 1)))
    println(isPalindrome(List(1, 2, 3, 2)))
  }

  def isPalindrome[A](list: List[A]): Boolean = {
    list.equals(list.reverse)
  }
}