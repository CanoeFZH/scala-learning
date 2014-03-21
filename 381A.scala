import java.util.Scanner

object CF381A { 

    def main(args: Array[String]) {
        val in = new Scanner(System.in)
        val n = in.nextInt()
        val cards = for(i <- 0 until n) yield in.nextInt()
        val answers = gao(cards.toList)
        println(answers._1 + " " + answers._2)
    }

    def gao(list: List[Int]): (Int, Int) = {
        if (list.isEmpty) (0, 0) 
        else if (list.head > list.last) {
            val scores = gao(list.tail).swap
            (list.head + scores._1, scores._2)
        } else {
            val scores = gao(list.init).swap
            (list.last + scores._1, scores._2)
        }
    }
}
