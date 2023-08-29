// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    AVANCADO
}

class Usuario(
    val nome: String,
    val email: String,
    val nivelExperiencia: Nivel,
)

data class ConteudoEducacional(
    var nome: String,
    val duracao: Int = 60,
    val tipo: ConteudoTipo,
)

enum class ConteudoTipo {
    AULA,
    VIDEO,
    ARTIGO,
}

class Formacao(
    val nome: String,
    var conteudos: List<ConteudoEducacional>,
    val nivelConhecimentoNecessario: Nivel = Nivel.BASICO,
) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun listarInscritos() = inscritos.toList()
}

fun main() {
    val usuario = Usuario(nome = "Willian Osaida", email = "willian@example.com", nivelExperiencia = Nivel.INTERMEDIARIO)
    val formacao = Formacao(nome = "Formação Kotlin", conteudos = listOf(
        ConteudoEducacional(nome = "Aprendendo Kotlin", duracao = 120, tipo = ConteudoTipo.AULA),
        ConteudoEducacional(nome = "Programando em Kotlin", duracao = 240, tipo = ConteudoTipo.VIDEO),
    ))

    formacao.matricular(usuario)

    println(formacao.listarInscritos())
    // [Usuario(nome = "Willian Osaida", email = "Willian@example.com", nivelExperiencia = Nivel.INTERMEDIARIO)]
}

