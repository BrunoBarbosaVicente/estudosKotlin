fun divisao(num1: Int, num2: Int): Int {  
    var resultado = 0
    if (num2 != 0){
        resultado  = num1 / num2
    } else {
        println("Não é possivel dividir por zero")
    }
    return resultado
}
fun main () {
    print("Digite o primeiro numero: ")
    val n1 = readln().toInt()
    print("Digite o segundo numero: ")
    val n2 = readln().toInt()
    divisao(n1, n2)
}