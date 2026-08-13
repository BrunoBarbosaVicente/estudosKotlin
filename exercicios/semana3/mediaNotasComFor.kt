fun main () {
    var soma = 0.0
    var media = 0.0
    for (i in 1..5){
        println("digite suas nota:")
        val nota = readln().toDouble()
        soma += nota
    }
    media = soma / 5
    println("Sua media é $media")
}