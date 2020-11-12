class Professor(val nome : String, val regDocente : Int) {

    var listaDeChamada = mutableListOf<Aluno>()

    fun darAula(materia : Materia, turma: Turma, curso: Curso ){
        println("Estou dando aula da matéria ${materia.nome}")
        println("Turma : ${turma.nome}")
        println("Curso: ${curso.nome}")
    }

    fun adicionarNaChamada(aluno: Aluno){
        listaDeChamada.add(aluno)
    }
    fun imprimirListaDeChamadas(){
        for(aluno in listaDeChamada){
            println(aluno)
        }
    }
}

