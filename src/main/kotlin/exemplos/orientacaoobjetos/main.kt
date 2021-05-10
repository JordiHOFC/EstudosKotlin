import exemplos.orientacaoobjetos.Conta
import exemplos.orientacaoobjetos.Funcionario

fun main(args: Array<String>) {
    val jordi = Funcionario(
        nome = "Jordi Henrique Marques da Silva",
        cpf = "222.111.333.45",
        salario = 2000.0
    )
    val bonificacao = jordi.bonificacao()
    println("$jordi \ntem direito a $bonificacao de bonificacao")
}

private fun testeandoConta() {
    println("Seja bem vindo a bytebank")
    val titular: String = "Jordi H. M. Silva"
    val numero_conta: String = "04-05-2021/1"
    var saldo = 200
    var myfuck = { texto: String -> println(texto) }
    val contaJordi = Conta(titular, numero_conta, saldo = 200.0);
    val contaBei = Conta("Gabriel", "22913092103", saldo = 200.0)
    for (i in 1..5) {
        contaBei.realizaTransferencia(i * 10.0, contaJordi)
    }

    println(contaBei)
    contaBei.saque(200.0)
}

