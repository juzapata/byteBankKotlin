class Calculadora {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }
}

//class Calculadora {
//    var total: Double = 0.0
//        private set
//    // não é necessario fazer as tres funções pros 3 tipos de funcionarios. só precisa da primeira, porque das outras
//    // duas classes são do filhos das Funcionario, e o Kotlin vai entender que qualquer implementação relacionada a classe
//    // é a classe em si.
//    fun registra(funcionario: Funcionario){
//        this.total += funcionario.bonificacao()
//    }
////    fun registra(gerente: Gerente){
////        this.total += gerente.bonificacao()
////    }
////    fun registra(diretor: Diretor){
////        this.total += diretor.bonificacao()
////    }
//}