//package C
//
//fun main() {
//    val n = readLine()!!.toInt()
//    var r:Int = 0
//    var L = mutableListOf<Int>()
//    L.add(1)
//    for (i in 0 until n){
//        L.add(readLine()!!.toInt())
//    }
//    for (i in 0 until L.size-1){
//        var a = L[i]-L[i+1]
//        if (a<0) {a*=-1}
//        r+=a
//    }
//    println(r)
//}