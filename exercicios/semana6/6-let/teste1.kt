fun main (){
    var nome: String? = "Bruno"
    nome?.let {
        println("Nome: $it")
        println("Quantidade de caracteres: ${it.length}")
    }
}