def _factorial(n: Int, ans: Double, i: Int): Double = {
  if (i > n) {
    ans
  } else {
    _factorial(n, ans + math.log(i), i + 1)
  }
}