fun main () {
    val produtos = mapOf("Mouse" to 100.0, "Teclado" to 150.0, "Monitor" to 900.0, "Headset" to 250.0)
    for ((produto, preco) in produtos){
        println("$produto - R$ $preco")
    }
}