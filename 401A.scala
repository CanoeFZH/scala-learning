import java.util.Scanner

object CF401A extends App {
    val in = new Scanner(System.in)
    val n = in.nextInt
    val x = in.nextInt 
    val sum = Math.abs((0 until n).map(_ => in.nextInt).sum)
    val answer = (sum + x - 1) / x;
    println(answer)
}
