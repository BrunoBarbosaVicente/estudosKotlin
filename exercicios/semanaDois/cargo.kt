fun main() {
    println("Digite o seu cargo:")
    val cargo = readln()
    when (cargo.uppercase()){
        "DEV" -> println("Você terá um aumento de 20%")
        "QA" -> println("Você terá um aumento de 15%")
        "SUPORTE" -> println("Você terá um aumento de 10%")
        "GERENTE" -> println("Você terá um aumento de 5%")
        else -> println("Cargo inválido. Digite DEV, QA, SUPORTE ou GERENTE.")
    }
}