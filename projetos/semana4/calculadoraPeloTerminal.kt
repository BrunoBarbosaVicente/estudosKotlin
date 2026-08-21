fun somar(vararg numeros: Int): Int {
    var resultado = 0
    for (numero in numeros){
        resultado += numero
    }
    return resultado
}
fun subtracao(vararg numeros: Int): Int {
    var resultado = numeros[0]
    for (numero in 1 until numeros.size){
        resultado -= numeros[numero]
    }
    return resultado
}
fun multiplicacao(vararg numeros: Int): Int{
    var resultado = 1
    for (numero in numeros){
        resultado *= numero
    }
    return resultado
}
fun divisao(vararg numeros: Int): Int {
    var resultado = numeros[0]
    for (numero in 1 until numeros.size){
        resultado /= numeros[numero]
    }
    return resultado
}
fun main () {
    println("Digite o primeiro número:")
    val n1 = readln().toInt()
    println("Digite o segundo numero:")
    val n2 = readln().toInt()
    println("Digite a operação:")
    val operador = readln()
    val resultado = when (operador){
        "+" -> somar(n1, n2)
        "-" -> subtracao(n1, n2)
        "*","x" -> multiplicacao(n1, n2)
        "/" -> divisao(n1, n2)
        else -> "Operador invalido"
    }
    println("Resultado: $resultado")
}