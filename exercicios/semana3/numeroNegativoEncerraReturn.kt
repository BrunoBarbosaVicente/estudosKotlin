fun numeroNegativo (numero: Int): String {
    if (numero < 0){
        return "programa encerrado, numero inserido é negativo $numero"
    }
    return "numero positivo $numero" 
}

fun main () {
    println("digite um numero:")
    val numero = readln().toInt()
    println(numeroNegativo(numero))
}