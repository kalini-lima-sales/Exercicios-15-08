fun main(){

    val pi = 3.14

    print("Digite o diâmetro para calcularmos a área e o perímetro de um círculo: ")
    var diametro = readln().toDouble()

    var divisao = diametro / 2
    var multiplicacao = (divisao * divisao) * pi

    println("O valor da área do círculo é: $multiplicacao")

    var multiplicacao2 = diametro * pi
    println("O valor do perímetro do círculo é: $multiplicacao2")



}