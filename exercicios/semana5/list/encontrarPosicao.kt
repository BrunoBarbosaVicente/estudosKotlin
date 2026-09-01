fun main () {
    val nomes = listOf<String>("Bruno", "Ana", "Carlos", "Maria", "João")
    print("Digite um nome: ")
    val nome = readln()
    val resultado = nomes.indexOf(nome)
    if (nome in nomes){
        println("$nome está na posição $resultado")
    } else {
        println("Nome não encontrado")
    }
}