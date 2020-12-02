//package C
//
//var n = mutableListOf<Int>()
//var result=""
//fun main() {
//    val fin = readLine()!!.split(" ")
//    fin.forEach { n.add(it.toInt()) }
//    val s = readLine()!!
//    val l =s.length
//    for (i in 0 until l){
//        c(s[i].toString())
//    }
//    println(result)
//}
//
//fun c(s:String){
//    when (s) {
//        "a" -> f(0,"a")
//        "b" -> f(1,"b")
//        "c" -> f(2,"c")
//        "d" -> f(3,"d")
//        "e" -> f(4,"e")
//        "f" -> f(5,"f")
//        "g" -> f(6,"g")
//        "h" -> f(7,"h")
//        "i" -> f(8,"i")
//        "j" -> f(9,"j")
//        "k" -> f(10,"k")
//        "l" -> f(11,"l")
//        "m" -> f(12,"m")
//        "n" -> f(13,"n")
//        "o" -> f(14,"o")
//        "p" -> f(15,"p")
//        "q" -> f(16,"q")
//        "r" -> f(17,"r")
//        "s" -> f(18,"s")
//        "t" -> f(19,"t")
//        "u" -> f(20,"u")
//        "v" -> f(21,"v")
//        "w" -> f(22,"w")
//        "x" -> f(23,"x")
//        "y" -> f(24,"y")
//        "z" -> f(25,"z")
//    }
//}
//
//fun f(num:Int,string: String){
//    when {
//        n[num]>0 -> {
//            result+=string
//            n[num]-=1
//        }
//        n[num]<=0 -> {}
//    }
//
//}