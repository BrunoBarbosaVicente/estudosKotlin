fun main() {
    val nome = "Bruno Vicente"
    val produto1 = "Arroz"
    val preco1 = 29.90
    val qtd1 = 2
    val produto2 = "Feijão"
    val preco2 = 9.50 // readln()toDouble se fosse possivel inserir dados aqui no kotlin playground
    val qtd2 = 4	  // readln()toInt()
    val produto3 = "Refrigerante"
    val preco3 = 8.00
    val qtd3 = 3
    val subtotal = (preco1 * qtd1) + (preco2 * qtd2) + (preco3 * qtd3)
    val percentual = 10.0
    val desconto = subtotal * (percentual / 100)
    
    println("==========================")
    println("       CUPOM FISCAL       ")
    println("==========================")
    println()
    println("Cliente: $nome")
    println()
    println("Produto: $produto1")
    println("Preço: R$ %.2f".format(preco1))
    println("Quantidade: $qtd1")
    println("Subtotal: R$ %.2f".format(preco1 * qtd1))
    println()
    println("-----------------------")
    println()
    println("Produto: $produto2")
    println("Preço: R$ %.2f".format(preco2))
    println("Quantidade: $qtd2")
    println("Subtotal: R$ %.2f".format(preco2 * qtd2))
    println()
    println("-----------------------")
    println()
    println("Produto: $produto3")
    println("Preço: R$ %.2f".format(preco3))
    println("Quantidade: $qtd3")
    println("Subtotal: R$ %.2f".format(preco3 * qtd3))
    println()
    println("=======================")
    println()
    println("Total da compra: %.2f".format(subtotal))
    println("Desconto (10%): R$ $desconto")
    println("Valor Final: R$ ${subtotal - desconto}")
    println()
    println("Obrigado pela preferência!")
}