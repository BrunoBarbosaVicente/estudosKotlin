fun analisarNumeros(vararg numeros: Int): String {
    var contador = 0
    var soma = 0
    var maior = numeros[0]
    var menor = numeros[0]
    for (numero in numeros){
        if(numero > maior){
            maior = numero
        } 
        if (numero < menor) {
            menor = numero
        }
        soma += numero
        contador++
    }
    return "Quantidade: $contador" + 
            "\nSoma: $soma" + 
            "\nMaior: $maior" + 
            "\nMenor: $menor"
}
fun main () {
    println(analisarNumeros(100, 50, 10, 90, 1))
}