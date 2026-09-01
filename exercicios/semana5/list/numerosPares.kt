fun main () {
    val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    for (numero in numeros){
        if (numero % 2 == 0){
            println(numero)
        }
    }
}