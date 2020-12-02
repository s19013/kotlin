//package C
//
//var R=0
//fun main() {
//    var Box= mutableListOf<List<String>>()
//    val N = readLine()!!.toInt()
//
//    for (i in 0 until N){
//        Box.add(readLine()!!.split(" "))
//    }
//    for (i in Box){
//        a(i)
//    }
//    println(R)
//}
//
//fun a (l:List<String>) {
//    var score =0
//    for (i in 1..5){
//        score += l[i].toInt()
//    }
//    if (score<350){return }
//    if (l[0]=="s"){
//        if ((l[2].toInt() + l[3].toInt())<160){ return }
//        else R+=1
//    }
//    if (l[0]=="l"){
//        if ((l[4].toInt() + l[5].toInt())<160){ return }
//        else R+=1
//    }
//}
//
//
