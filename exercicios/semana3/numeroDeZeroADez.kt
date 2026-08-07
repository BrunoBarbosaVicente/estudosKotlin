fun main() {
    var nota: Int
    var contador = 0
    do {
        println("digite uma nota de 0 a 10")
        nota = readln().toInt()
        contador++
        if (nota < 0 || nota > 10) {  // if se a condição for true executa e segue o fluxo
            println("nota invalida")
        }
    } while (nota < 0 || nota > 10) // while para executar ele espera a condição ser false, caso contrario ele repete o laço
    println("Nota válida cadastrada: $nota (Tentativas: $contador)")  
}