object CF391A extends App {

    val string = readLine()
    
    @scala.annotation.tailrec
    def gao(str: String, evenNumber: Int = 0): Int = str match { 
        case "" => evenNumber
        case other => 
            val cntNumber = str.takeWhile(str(0) == _).size
            if (cntNumber % 2 == 0) 
                gao(str drop cntNumber, evenNumber + 1) 
            else 
                gao(str drop cntNumber, evenNumber)
        }
    
    println(gao(string))
}
