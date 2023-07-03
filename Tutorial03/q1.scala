package Tutorial03

object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the string:")
    val inputString = scala.io.StdIn.readLine()
    println("You entered: " + inputString)

    val lettersArray = inputString.toCharArray
    val reversedString = reverseString(inputString)
    println( "The reversed string is " + reversedString)
  }

  def reverseString(str: String): String = {
    if (str.isEmpty)
      ""
    else
      reverseString(str.tail) + str.head
  }
}
