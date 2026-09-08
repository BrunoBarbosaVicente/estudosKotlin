fun main (){
    var nome: String? = null
    //println(nome.length) //-> retorna erro mesmo contendo valor null ou string ja na variavel
    println(nome?.length)
}