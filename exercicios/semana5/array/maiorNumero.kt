fun main() {
    val numeros = arrayOf(10, 100, 50, 25, 5)
    var numeroMaior = numeros[0]
    for (numero in numeros){
        if (numero > numeroMaior){
            numeroMaior = numero
        }
    }
    println(numeroMaior)
}