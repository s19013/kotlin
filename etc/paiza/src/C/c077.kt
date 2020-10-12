//package C
//
//fun main() {
//    val inFirst = readLine()!!.split(" ")
//    val k = inFirst[0].toInt()
//    val n = inFirst[1].toInt()
//    val OneScore = 100/n
//    var Dlist = mutableListOf<Int>()
//    var Alist = mutableListOf<Int>()
//    for (i in 0 until k){
//        val inSecond = readLine()!!.split(" ")
//        Dlist.add(inSecond[0].toInt())
//        Alist.add(inSecond[1].toInt())
//    }
//    for (i in 0 until k){
//        keisan(OneScore,Dlist[i],Alist[i])
//    }
//}
//
//fun keisan(o:Int,d:Int,a:Int) {
//    val score = a*o
//    var r:Int
//    when {
//        0<d && d<10 -> r=(score*0.8).toInt()
//        10<=d -> r=score*0
//        else -> r=score
//    }
//
//    when{
//        80<=r && r<=100 -> println("A")
//        70<=r && r<=79 -> println("B")
//        60<=r && r<=69 -> println("C")
//        else -> println("D")
//    }
//}
