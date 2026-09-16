class Carro {
    var marca = ""
    var modelo = ""
    var ano = 0
}

fun main (){
    val carro1 = Carro()
    carro1.marca = "Toyota"
    carro1.modelo = "Corolla"
    carro1.ano = 2022
    
    val carro2 = Carro()
    carro2.marca = "Honda"
    carro2.modelo = "Civic"
    carro2.ano = 2024
    
    println("${carro1.marca}, ${carro1.modelo}, ${carro1.ano}")
    println("${carro2.marca}, ${carro2.modelo}, ${carro2.ano}")
}