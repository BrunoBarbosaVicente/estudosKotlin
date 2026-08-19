fun mostrarNumeros(vararg numeros: Int) {
    for (numero in numeros){
        println(numero)
    }
}
fun main () {
    mostrarNumeros(10, 20, 30)
}