package Tutorial02

object q2 {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    b = b-1
    println("(--b * a + c * d--) is " + (b*a+c*d))
    d = d-1
    println("(a++) is " + (a))
    a = a+1
    //println (–2 * ( g – k ) +c) // This gives an error as the variable g is not declared or initialized in the given code
    println("(c=c++) is " + (c))
    c = c +1
    c = c +1
    println ("(c=++c*a++)) is " + (c*a))
  }
}