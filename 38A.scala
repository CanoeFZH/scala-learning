object CF38A extends App { 

    val n = readLine().toInt
    val d = readLine.split(" ").map(_.toInt)
    val range = readLine.split(" ").map(_.toInt)
    val a = range(0)
    val b = range(1)
    println(d.drop(a - 1).take(b - a).sum)

}
