fun main () {
    val numeros = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    for (numero in numeros.indices){
        println("Indice $numero")
    }
    for (numero in numeros){
        println("Imprime o valor que o indice guarda $numero")
    }
}