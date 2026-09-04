fun main () {
    val nomes = mutableSetOf<String>()
    var contador = 1
    println("Digite 5 nomes:")
    while (contador <= 5){
        println("digite o nome $contador")
        val entrada = readln()
        nomes.add(entrada)
        contador++
    }
    for (nome in nomes){
        println(nome)
    }
    println(nomes.size)
}