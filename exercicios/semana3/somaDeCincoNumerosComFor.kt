fun main () {
    var soma = 0
    for (i in 1..5){
        println("digite um numero:")
        val numero = readln().toInt()
        soma += numero
    }
    println("a soma dos numeros é $soma")
}