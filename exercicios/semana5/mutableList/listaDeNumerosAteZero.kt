fun main () {
    val numeros = mutableListOf<Int>()
    println("Digite os numeros que deseja armazenar.")
    var contador = 1
    do {
        println("Digite o numero $contador:")
        val entrada = readln().toInt()
        if (entrada != 0){
            numeros.add(entrada)
        }
        contador++                
    } while (entrada != 0)
    println("numeros cadastrados:")
    for (numero in numeros){
        println(numero)
    }
}