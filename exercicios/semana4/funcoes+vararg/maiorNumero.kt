fun maiorNumero (vararg numeros: Int): Int {
    var numeroMaior = 0
    for (numero in numeros){
        if(numeroMaior < numero){
            numeroMaior = numero
        }
    }
    return numeroMaior
}
fun main () {
    println(maiorNumero(50, 20, 5, 10))
}