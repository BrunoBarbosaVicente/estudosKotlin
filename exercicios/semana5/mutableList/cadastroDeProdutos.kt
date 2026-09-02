fun main () {
    val produtos = mutableListOf<String>()
    println("Informe 5 produtos")
    var contador = 1
    while (contador <= 5){
        println("digite o produto ${contador}")
        val entrada = readln()
        produtos.add(entrada)
        contador++
    }
    for (produto in produtos){
        println(produto)
    }    
}