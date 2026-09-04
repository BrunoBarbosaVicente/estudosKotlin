fun main () {
    val numeros = mutableSetOf<Int>()
    var contador = 1
    var entrada = 1
    println("Digite os numeros ou 0 para finalizar")
    while (entrada != 0){
        print("Numero $contador:")
        entrada = readln().toInt()
        if (entrada == 0){
            break
        } else {
            numeros.add(entrada)
            contador++
        }
    }
    for (numero in numeros){
        println(numero)
    }
}