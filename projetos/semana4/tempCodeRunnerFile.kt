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
        if (numeros[numero] == 0){
        println("Não é possível dividir por zero")
        return 0
        }
        resultado /= numeros[numero]
    }
    return resultado
}
fun calcular(n1: Int, n2: Int, operador: String){
    when (operador){
        "+" -> somar(n1, n2)
        "-" -> subtracao(n1, n2)
        "*","x" -> multiplicacao(n1, n2)
        "/" -> divisao(n1, n2)
        else -> "Operador invalido"
    }
}
fun main () {
    println("==================")
    println("Calculadora Kotlin")
    println("==================")
    print("Digite o primeiro número: ")
    val n1 = readln().toInt()
    print("Digite o segundo numero: ")
    val n2 = readln().toInt()
    print("Digite a operação: ")
    val operador = readln()
    println(calcular(n1, n2, operador))
}