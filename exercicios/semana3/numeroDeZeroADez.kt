fun main() {
    var nota: Int
    var contador = 0
    do {
        println("digite uma nota de 0 a 10")
        nota = readln().toInt()
        contador++
    } while (nota < 0 || nota > 10)
    println("Nota válida cadastrada: $nota (Tentativas: $contador)")  
}