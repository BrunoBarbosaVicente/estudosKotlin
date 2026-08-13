fun main () {
    println("Digite um numero:")
    val numero = readln().toInt()
    for (i in numero downTo 1){
        println(i)
    }
}