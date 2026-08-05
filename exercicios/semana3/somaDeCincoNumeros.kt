fun main() {
    var numero = 0
    println("Digite cinco números para somar:")
    var contador = 1
    while (contador <= 5) {
        numero += readln().toInt()
        contador++
    }
    println("A soma dos cinco números é: $numero")
}