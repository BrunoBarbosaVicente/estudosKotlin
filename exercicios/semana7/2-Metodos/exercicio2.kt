class Carro {
    var marca = ""
    var modelo = ""
    var ano = 0
    
    var velocidade = 0
    
    fun mostrarDados() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Ano: $ano")
    }
    fun acelerar(valor: Int){
        velocidade += valor
        println("$velocidade km/h")
    }
    fun frear(valor: Int){
        velocidade -= valor
        if(velocidade < 0){
            velocidade = 0
        } 
        println("$velocidade km/h")
 
    }
}
fun main (){
    val carro1 = Carro()
    carro1.marca = "Toyota"
    carro1.modelo = "Corrolla"
    carro1.ano = 2022
    carro1.mostrarDados()
    carro1.acelerar(20)
    carro1.frear(30)
}