fun main () {
    println("digite um numero:")
    val numero = readln().toInt()
    println("Tabuada do $numero")
    for (i in 1..10){
        println("$numero x $i = ${numero * i}")
    }
}