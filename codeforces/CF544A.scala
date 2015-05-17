/**
 * Created by canoe on 5/17/15.
 */

object CF544A {
  def main(args: Array[String]) {
    val Array(n, m, b, mod) = readLine().split(" ").map(_.toInt)
    val A = readLine().split(" ").map(_.toInt)
    val dp = Array.ofDim[Int](2, m + 8, b + 8)

    dp(0)(0)(0) = 1
    for (i <- 1 to n) {
      for (j <- 0 to m) {
        for (k <- 0 to b) {
          dp(i & 1)(j)(k) = dp(1 - (i & 1))(j)(k)
          if (k >= A(i - 1) && j >= 1) {
            dp(i & 1)(j)(k) += dp(i & 1)(j - 1)(k - A(i - 1))
          }
          dp(i & 1)(j)(k) %= mod
        }
      }
    }

    var answer: Int = 0
    for (i <- 0 to b) {
      answer += dp(n & 1)(m)(i)
      answer %= mod;
    }
    println(answer)
  }
}
