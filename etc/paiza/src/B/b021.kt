//package B
//
//val N = readLine()!!.toInt()
//var box = mutableListOf<String>()
//val listEs = listOf<String>("s","sh","ch","o","x")
//val listB = listOf<String>("a","i","u","e","o")
//fun main() {
//    for (i in 0 until N){
//        box.add(readLine()!!)
//    }
//    for (s in box) {
////        println(s[s.length-2].toString() == "a")
//        check(s)
//    }
//}
//
//fun check(s:String) {
//    for (es in listEs){
//        if (s.endsWith(es)) {
//            println(s+"es")
//            return
//        }
//    }
//    if (s.endsWith("f")){
//        println(s.substring(0,s.length-1)+"ves")
//        return
//    }
//    if (s.endsWith("fe")){
//        println(s.substring(0,s.length-2)+"ves")
//        return
//    }
//    if (s.endsWith("y")){
//        for (ies in listB){
//            if (s[s.length-2].toString() == ies) {
//                println(s+"s")
//                return
//            }
//            else {
//                println(s.substring(0,s.length-1)+"ies")
//                return
//            }
//        }
//    }
//    println(s+"s")
//    return
//}
//
