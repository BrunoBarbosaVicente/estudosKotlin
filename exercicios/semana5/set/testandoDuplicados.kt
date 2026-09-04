fun main (){
    val numeros = mutableSetOf(10, 20, 30, 10, 20, 40, 30, 50)
    for (numero in numeros){
        println(numero)
    }
    println(numeros.size) // imprimi apenas 5 numeros pois o set elimina os numeros repetidos.
    
}