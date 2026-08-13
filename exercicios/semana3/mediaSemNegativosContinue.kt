fun main () {
    var soma = 0.0
    var contador = 0
    for (i in 1..5){
        println("digite suas notas")
        val nota = readln().toDouble()
        if (nota < 0 || nota > 10){
            continue
        }
        soma += nota
        contador++
    }
    val media = soma / contador
    println("Sua media é $media")
}