package exemplos.orientacaoobjetos

class Conta(val titular: String, val numeroConta: String, var saldo: Double) {
    fun realizaTransferencia( valor: Double,  destinatario: Conta){
        if (saldo>=valor){
            println("Realizando transferencia de: $titular para ${destinatario.titular}\n valor: $valor")
            destinatario.depositar(valor)
            saldo -= valor
        }else{
            println("Saldo insuficiente")
        }
    }
    fun depositar(valor: Double){
        println("Deposito no valor de $valor realizado com sucesso!")
        saldo+=valor
    }
    fun saque(valor: Double){
        if (saldo>=valor){
            println("Saque de $valor realizado com sucesso!")
            saldo-=valor
        }else{
            println("Valor indisponivel para saque")
        }
    }
    override fun toString(): String {
        return "Titular: $titular \nNumero da conta : $numeroConta \nSaldo: $saldo "
    }
}