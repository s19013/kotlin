package C//val N = readLine()!!.toInt()
//fun main() {
//    for (i in 0 until N){
//        var kuriage = false
//        var a = readLine()!!.split(" ")
//        var b = a[0].split(":")
//        var min = b[1].toInt() + a[2].toInt()
//        var hour = b[0].toInt() + a[1].toInt()
//        if (min >= 60){
//            kuriage = true
//            min -= 60
//        }
//        if (kuriage == true){
//            hour +=1
//        }
//        if (hour >= 24){
//            hour -=24
//        }
//        when{
//            hour<10&&min<10 -> println("0$hour:0$min")
//            hour<10 -> println("0$hour:$min")
//            min<10 -> println("$hour:0$min")
//            else->println("$hour:$min")
//        }
//    }
//}