fun main() {
    val numeros = Array(5) {0}
    for (numero in numeros.indices){
        println("Digite o ${numero + 1}° numero:")
        numeros[numero] = readln().toInt()
    }
    for (numero in numeros){
        println(numero)
    }
    
}