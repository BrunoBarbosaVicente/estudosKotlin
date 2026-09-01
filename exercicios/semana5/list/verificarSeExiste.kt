fun main (){
    val nomes = listOf<String>("Bruno", "Ana", "Carlos", "Maria", "João")
    print("Digite um nome: ")
    val nome = readln()
    val resultado = nomes.contains(nome)
    if (resultado){
        println("Nome encontrado")
    } else {
        println("Nome não encontrado")
    }
}