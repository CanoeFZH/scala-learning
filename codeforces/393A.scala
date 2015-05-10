object CF393A extends App {

    val string = readLine()
    val cntList = List('n', 'i', 't', 'e').map(char => string.count(char == _)).toArray
    cntList(0) = (cntList(0) - 1) / 2
    cntList(3) /= 3
    println(cntList.min)

}
