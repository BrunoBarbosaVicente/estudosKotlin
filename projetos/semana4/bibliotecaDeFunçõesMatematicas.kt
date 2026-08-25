fun somar(vararg numeros: Int): Int {
    var resultado = 0
   for (numero in numeros){
       resultado += numero
    }
    return resultado
}
fun subtrair(n1: Int, n2: Int): Int {
    return n1 - n2
}
fun multiplicar(n1: Int, n2: Int): Int {
    return n1 * n2
}
fun dividir(n1: Int, n2: Int): Int {
    return n1 / n2
}
fun media(vararg numeros: Double): Double {
    var resultado = 0.0
    var contador = 0
    for (numero in numeros){
        resultado += numero
        contador++
    }
    return resultado / contador
}
fun maiorNumero(n1: Int, n2: Int): Int {
    if (n1 > n2){
        return n1
    }
    return n2
}
fun menorNumero(n1: Int, n2: Int): Int {
    if (n1 < n2){
        return n1
    }
    return n2
}
fun calcularArea(n1: Double): Double {
    return n1 * n1
}
fun calcularArea(n1: Double, n2: Double): Double {
    return n1 * n2
}
fun imprimirMenu(){
    println("===========================")
    println("   Biblioteca Matemática   ")
    println("===========================")
    println("\n1 - Somar")
    println("2 - Subtrair")
    println("3 - Multiplicar")
    println("4 - Dividir")
    println("5 - Média")
    println("6 - Maior número")
    println("7 - Menor número")
    println("8 - Calcular área")
    println("0 - Sair")
}
fun main () {
    
    do {
        imprimirMenu()
        println("Escolha uma opção: ")
        val entradaMenu = readln().toInt()
        when (entradaMenu) {
            1 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = somar(n1, n2)
                println("Resultado: $resultado")
            }
            2 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = subtrair(n1, n2)
                println("Resultado: $resultado")
            }
            3 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = multiplicar(n1, n2)
                println("Resultado: $resultado")
            }
            4 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = dividir(n1, n2)
                println("Resultado: $resultado")
            }
            5 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toDouble()
                println("Digite o segundo numero:")
                val n2 = readln().toDouble()
                val resultado = media(n1, n2)
                println("Resultado: $resultado")
            }
            6 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = maiorNumero(n1, n2)
                println("O numero maior é: $resultado")
            }
            7 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toInt()
                println("Digite o segundo numero:")
                val n2 = readln().toInt()
                val resultado = menorNumero(n1, n2)
                println("O numero menor é: $resultado")
            }
            8 -> {
                println("Digite o primeiro numero:")
                val n1 = readln().toDouble()
                println("Digite o segundo numero:")
                val n2 = readln().toDouble()
                if (n2 == 0.0){
                    val resultado = calcularArea(n1)
                    println("A area do quadrado é: $resultado")
                } else {
                    val resultado = calcularArea(n1, n2)
                    println("A area do quadrado é: $resultado")
                }
            }
            0 -> {
                println("Calculadora finalizada...")
                break
            }
            else -> {println("Numero invalido...")}
        }
    } while (entradaMenu != 0) 
}
