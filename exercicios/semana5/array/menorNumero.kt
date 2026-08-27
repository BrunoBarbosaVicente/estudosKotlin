fun main () {
    val numeros = arrayOf(10, 1, 50, 25, 15)
    var numeroMenor = numeros[0]
    for (numero in numeros) {
        if (numeroMenor > numero){
            numeroMenor = numero
        }
    } 
    println(numeroMenor)
}