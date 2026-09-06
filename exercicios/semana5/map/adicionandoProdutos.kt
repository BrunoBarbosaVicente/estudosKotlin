fun main () {
    val produtos = mutableMapOf<String, Double>()
    println("Cadastre 5 produtos e seus pespectivos preços.")
    var contador = 1
    while (contador <= 5){
        print("Digite o $contador º produto: ")
        val entradaProduto = readln()
        print("Valor do produto: ")
        val entradaValor = readln().toDouble()
        produtos[entradaProduto] = entradaValor
        contador++
    }
    println("Produtos cadastrados:")
    for ((produto, preco) in produtos){
        println("$produto -> R$ $preco")
    }
}