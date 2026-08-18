fun saudacao (nome: String): String {
    return "Olá, $nome"
}
fun saudacao (nome: String, idade: Int): String {
    return "Olá, $nome você tem $idade anos"
}
fun main () {
    val saudacao1 = saudacao("Bruno")
    println(saudacao1)
    val saudacao2 = saudacao("Bruno", 33)
    println(saudacao2)
}