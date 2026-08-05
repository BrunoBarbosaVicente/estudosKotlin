fun main() {
    var contador = 1
    println("Digite cinco números inteiros (digite 0 para encerrar):")
    var soma = 0
    var continua = true
    while (contador <= 5 && continua) {
        val entrada = readln().toInt()
        if (entrada == 0) {
            continua = false
        } else {
            soma += entrada
        }
    }
    println("A soma dos números é: $soma")
}