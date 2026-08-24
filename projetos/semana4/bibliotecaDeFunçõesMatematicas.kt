fun somar(vararg numeros: Int): Int {
    var resultado: Int
    for (numero in numeros){
        resultado += numero
    }
    return resultado
}
//fun subtrair() {

//}
//fun multiplicar() {

//}
//fun dividir() {

//}
//fun media(vararg numeros: Double): Double {

//}
//fun maiorNumero(){

//}
//fun menorNumero() {

//}
//fun calcularArea() {

//}
//fun calcularArea() {

//}
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
    imprimirMenu()
    val entradaMenu = readln()
    contador

}
