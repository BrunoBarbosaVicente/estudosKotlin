fun main() {
    val idade1 = 70
    if (idade1 < 16) {
        println("Não pode votar")
    } else if (idade1 <= 17){
        println("Voto facultativo")
    } else if (idade1 <= 69) {
        println("Voto obrigatorio")
    } else {
        println("Voto facultativo")
    }
}