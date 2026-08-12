fun main () {
    var soma = 0
    while (true) {
        println("Digite um numero: ou 0 para finalizar")
        val numero = readln().toInt()
        if (numero == 0){
            break
        }
        soma += numero
    }
    println("a soma é $soma")
    println("programa encerrado")
}