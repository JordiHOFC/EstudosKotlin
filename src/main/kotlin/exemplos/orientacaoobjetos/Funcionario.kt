package exemplos.orientacaoobjetos

class Funcionario(val nome:String, val cpf:String, var salario:Double=0.0) {
    fun bonificacao():Double{
        return salario*0.1
    }

    override fun toString(): String {
        return "exemplos.orientacaoobjetos.Funcionario\nnome: $nome\ncpf: $cpf\nsalario: $salario"
    }
}