//package C
//
//var h=readLine()!!.toInt()
//var t=3
//
//var pd= mutableListOf<Int>(1,1)
//
//var md = mutableListOf<Int>(1,1)
//
//var box=0
//
//fun main() {
//    h-=2
//    while (true){
//        if (h<=0) break
//        md.add(fp(pd[1],pd[0]))
//        md.removeAt(0)
//        println("md:${md}")
//        pd.add(fm(md[1],md[0]))
//        pd.removeAt(0)
//        println("pd:${pd}")
//        h-=pd[1]
//        println("h:${h}")
//        t+=1
//    }
//    print(t)
//}
//
//fun fp(a:Int,b:Int):Int{
//    return a+b
//}
//
//fun fm(a:Int,b:Int):Int{
//    return a*2+b
//}
//
//
