fun main() {
    var contador = 0
    var entrada: Int
    var soma = 0
    do{
        println("digite um numero:")
        entrada = readln().toInt()
        soma += entrada 
        contador++
    } while (entrada != 0)
    println("programa encerrado.")
    println("a soma é $soma") 
}