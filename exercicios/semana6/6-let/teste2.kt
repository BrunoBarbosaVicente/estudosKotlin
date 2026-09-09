fun main (){
    var nome: String? = null
    nome?.let {
        println("Nome: $it")
        println("Quantidade de caracteres: ${it.length}")
    }
    println("Não executou o bloco, por que nome é null")
}