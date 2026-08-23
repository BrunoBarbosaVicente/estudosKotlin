fun soma(vararg numeros: Int): Int {
    var resultado = numeros[0]
    for (numero in 0 until numeros.size){
        resultado += numeros[numero]
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
fun divisao(vararg numeros: Int): Int{
    var resultado = numeros[0]
    for (numero in 1 until numeros.size) {
        resultado /= numeros[numero]
    }
    return resultado
}
fun multiplicar(vararg numeros: Int): Int{
    var resultado = numeros[0]
    for (numero in 1 until numeros.size){
        resultado *= numeros[numero]
    }
    return resultado
}

fun main () {
    println(soma(10, 10, 30))
    println(subtracao(1000, 100))
    println(divisao(10, 10, 10))
    println(multiplicar(10, 10, 10))
}