fun main () {
    val nomes = mutableListOf("João", "Maria", "Carlos", "Ana")
    nomes[1] = "Mariana"
    nomes[2] = "Carlos Henrique"
    for (nome in nomes) {
        println(nome)
    }
}