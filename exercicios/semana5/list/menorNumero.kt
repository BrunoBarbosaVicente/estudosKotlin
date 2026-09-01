fun main (){
    val numeros = listOf<Int>(10,200,100,1,20,150)
    var menorNumero = numeros[0]
    for (numero in numeros){
        if (menorNumero > numero){
            menorNumero = numero
        }
    }
    println(menorNumero)
}