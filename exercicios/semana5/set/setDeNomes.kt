fun main () {
    val nomes = mutableSetOf("Joao", "Maria", "Carlos", "Ana")
    for (nome in nomes){
        println(nome)
    }
    println(nomes.size)
    println(nomes.contains("Maria"))
    println(nomes.contains("Pedro")) 
}