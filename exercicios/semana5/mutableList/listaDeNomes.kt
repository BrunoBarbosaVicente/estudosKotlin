fun main () {
    val nomes = mutableListOf<String>("João", "Maria", "Carlos")
    for (nome in nomes){
        println(nome)
    }
    nomes.add("Ana")
    nomes.add("Pedro")
    for (nome in nomes){
        println(nome)
    }
    println(nomes.size)
}