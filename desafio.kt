// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Usuario(val nome: String)

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val alunosMatriculados = mutableListOf<Usuario>()
    
    fun matricularAluno(usuario: Usuario) {
        alunosMatriculados.add(usuario)
        println("${usuario.nome} foi matriculado na formação de $nome.")
    }

    fun listarConteudos() {
        println("Conteúdos da formação de $nome (Nível: $nivel):")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} (Duração: ${conteudo.duracao} minutos)")
        }
    }
}

fun main() {
    // Criação de objetos para teste
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Banco de Dados", 120)
    val conteudo3 = ConteudoEducacional("Segurança da Informação", 150)

    val formacao1 = Formacao("Desenvolvedor Full Stack", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Engenheiro de Segurança", Nivel.DIFICIL, listOf(conteudo1, conteudo3))

    formacao1.matricularAluno(usuario1)
    formacao2.matricularAluno(usuario2)

    formacao1.listarConteudos()
    formacao2.listarConteudos()
}
