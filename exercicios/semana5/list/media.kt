fun main () {
    val notas = listOf<Double>(9.5, 7.5, 8.2, 4.5, 6.0)
    var media = 0.0
    var soma = 0.0
    for (nota in notas){
       soma += nota
       media = soma / notas.size 
    }
    println("%.2f".format(media))
}