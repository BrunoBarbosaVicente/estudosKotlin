// Reescreva alguns exercícios usando variáveis Boolean para deixar o código mais legível.

fun main(){
    println("Digite sua idade:")
    val idade = readln().toInt()
    val possuiCarteiraDeMotorista = true
    val podeDirigir = idade >= 18 && possuiCarteiraDeMotorista
    if (podeDirigir) {
        println("Você pode dirigir.")
    } else {
        println("Você não pode dirigir.")
    }
}