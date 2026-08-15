fun conversorTemperatura (temperatura: Double) {
    println("Temperatuta em Celsius: $temperatura")
    println("Temperatura em Fahrenheit: ${temperatura * 9 / 5 + 32}")
}
fun main () {
    conversorTemperatura(38.0)
}