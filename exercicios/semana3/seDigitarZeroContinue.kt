fun main () {
    for (i in 1..5){
        println("digite um numero:")
        val numero = readln().toInt()
        if (numero == 0){
            continue
        }
        println(numero)
    }
}