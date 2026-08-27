fun main () {
    val notas = arrayOf(5.0, 7.5, 8.0, 9.5, 6.0)
    var resultado = 0.0
    for (nota in notas){
        resultado += nota
    }
    val media = resultado / notas.size
    println(resultado)
    println(media)
}