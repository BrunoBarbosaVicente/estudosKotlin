fun soma(vararg numeros: Int): Int {
    var total = 0
    
    for (numero in numeros) {
        total += numero
    }
    
    return total
}

fun main () {
    println(soma(10, 20, 30, 40))
}