import scala.annotation.tailrec
@tailrec
// Factorial Function Implementation that uses Tail Recursion
def factorial(in_x: Double, prodsofar: Double = 1.0): Double = {
  if (in_x==0) prodsofar
  else factorial(in_x-1, prodsofar*in_x)
}
factorial(5.0)