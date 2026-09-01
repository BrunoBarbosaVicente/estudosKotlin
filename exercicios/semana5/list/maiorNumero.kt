fun main () {
    val numeros = listOf<Int>(10,200,100,50,20,150)
    var numeroMaior = numeros[0]
    for (numero in numeros){
        if (numeroMaior < numero){
            numeroMaior = numero
        }
    }
    println(numeroMaior)
}