fun imprimindoEntrada (numero: Int): String {
    if (numero == 0){
        return "numero invalido"
    }
    for (i in 1..numero){
        println(i)
    }
    return "programa encerrado"   
}

fun main () {
 println("digite um numero:")
 val entrada = readln().toInt()
 println(imprimindoEntrada(entrada))
}