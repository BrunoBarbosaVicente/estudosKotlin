fun main( ){
    var nome: String? = null // com a String "Bruno" ele imprime normalmente, mas com o null ele retorna um erro
    println(nome!!.length ?: 0)
}