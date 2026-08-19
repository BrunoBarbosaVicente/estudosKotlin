fun media(vararg notas: Double): Double {
    var resultado = 0.0
    var contador = 0
    for (nota in notas) {
        resultado += nota
        contador++
    }
    return resultado / contador
}
fun main () {
    println(media(9.5, 8.5, 7.5))
}