package C

import java.lang.Exception
import java.util.concurrent.atomic.AtomicLong

fun main() {
    val A = readLine()!!
    val B = readLine()!!
    var AList= mutableListOf<String>()
    var BList= mutableListOf<String>()
    val max =Math.max(A.length,B.length)
    for (i in 0 until A.length){
        AList.add(A[i].toString())
    }
    if (AList.size<max){
        for (i in 0 until max-A.length){
            AList.add(i,"0")
        }
    }
    println(AList)
}

fun f(a:MutableList<Int>,b:MutableList<Int>){

}
