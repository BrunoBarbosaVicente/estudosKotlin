fun main () {
    val numeros = mutableListOf<Int>(10, -5, 20, -8, 15, -2, 30)
    var indice = 0
    while (indice < numeros.size) {
        if (numeros[indice] < 0){
            numeros.removeAt(indice)
        } else {
            println(numeros[indice])
            indice++
        }
    }
}
       