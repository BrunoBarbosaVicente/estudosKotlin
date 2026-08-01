fun main() {
    println("digite um numero de 1 a 7:")
    println("para saber o dia da semana correspondente")
    val numero = readln().toInt()
    when (numero) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Número inválido. Digite um número de 1 a 7.")
    }clear
}