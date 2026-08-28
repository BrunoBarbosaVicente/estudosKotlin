fun somar (vararg numeros: Int): Int {
    var resultado = 0
    for (numero in numeros){
        resultado += numero
    }
    return resultado
}

fun maiorNumero(vararg numeros: Int): Int {
    var resultado = 0
    for (numero in numeros) {
        if (resultado < numero){
            resultado = numero
        }
    }
    return resultado
}

fun menorNumero(vararg numeros: Int): Int {
    var resultado = numeros[0]
    for (numero in numeros){
        if (resultado > numero){
            resultado = numero
        }
    }
    return resultado
}

fun media(vararg numeros: Int): Int {
    var resultado = 0
    for (numero in numeros) {
        resultado += numero
    }
    val media = resultado / numeros.size
    return media
}

fun main () {
    println("Quantos numeros deseja usar?:")
    val entradaUsuario = readln().toInt()
    val entradas = IntArray(entradaUsuario) {0}
    println("Digite ${entradas.size} numeros:")
    for (entrada in entradas.indices){
        print("numero: ")
        entradas[entrada] = readln().toInt()
    }
    for (entrada in entradas){
        println("Numeros Digitados: $entrada")
    }
    val resultadoSoma = somar(*entradas)
    println("Soma: $resultadoSoma")
    val numeroMaior = maiorNumero(*entradas)
    println("Maior: $numeroMaior")
    val numeroMenor = menorNumero(*entradas)
    println("Menor: $numeroMenor")
    val resultadoMedia = media(*entradas)
    println("Media: $resultadoMedia")
    
}