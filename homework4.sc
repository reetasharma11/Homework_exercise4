// Exercise 1
val x = 42.354562
val y = 3
val X = Math.round(double2Double(x) * 100.0) / 100.0
println("The round value of x  is "+  X)
println ("The left zero padding version of y is"+  f" $y%04d"  )



//Exercise 2

object Exercise2 {
  def factorial(n: Int): Int = {

    var f = 1
    for (i <- 1 to n) {
      f = f * i;
    }

    return f
  }

  // Driver Code
  def main(n: Int) {
    println(factorial(n))
  }
}
Exercise2.main(5:Int)
Exercise2.main(6:Int)
Exercise2.main(8:Int)

// Exercise 3
object Exercise3 {
def fact(n: Int): Int = {

  var f = 1
  for(i <- 1 to n)
  {
    f = f * i;
  }

  return f
}

// Driver Code
def main(n: Double) {
  println(fact(n.toInt))
}
}
Exercise3.main(4.53:Double)
// Exercise 4
object Exercise4 {
  def fibonacci(n: Int): Int =
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def main(args: Array[String]) {
    for {i <- List.range(0, 10)}
      yield {
        print(fibonacci(i) + ", ")
      }
    println("...")
  }
}
Exercise4.main(null)
//Exercise 5.1
object Exercise5_1 {
  def cube(n: Int): Int = {

    var f = (n * n * n)

    return f
  }

  def main(n: Int) {

    println("Here is the cube of " + n + ": " + cube(n))
  }
}
Exercise5_1.main(5:Int)

// Exercise 5.2
object Excercise5_2 {
  val cube = (n:Int) => n*n*n
  // Driver Code
  def main(n: Int)
  {
    println("Here is the cube of "+n+": "+cube(n))
  }
}

Excercise5_2.main(5)

