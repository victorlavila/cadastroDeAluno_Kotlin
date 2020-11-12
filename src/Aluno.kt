class Aluno(val registroAcademico : Int, var nome : String, val sobrenome : String)  {

    fun assistirAula(aula: Aula) {
        println("Assistindo aula ${aula.materia.nome}")
    }

    fun fazerLicoes(aula: Aula){
        println("Estou fazendo lição de ${aula.materia.nome}")
    }

    override fun toString(): String {
        return "$nome $sobrenome"
    }

}