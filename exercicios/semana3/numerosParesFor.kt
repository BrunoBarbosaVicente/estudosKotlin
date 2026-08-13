fun main () {
    var contador = 0
    println("Digite um numero:")
    val numero = readln().toInt()
    for (i in 2..numero step 2){
        contador++
    }
    println("A quantidade de numeros pares entre 0 e $numero é $contador")    
}