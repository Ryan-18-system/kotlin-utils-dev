import java.text.SimpleDateFormat
import java.util.*


// separador de data
const val SEPARADOR_DATA : String = "/"
// separador de hora
const val SEPARADOR_HORA: String = ":"
/** Número de informações sobre a data (dia, mês e ano)*/
const val NUMERO_INFORMACOES = 3

// número de informações sobre a hora (hora, minutos e segundos)
const val NUMERO_INFORMACOES_HORA = 3

/** Número de informações sobre a hora abreviada (hora, minutos) */
@Suppress("unused")
const val NUMERO_INFORMACOES_HORA_ABREVIADA = 2

/** Número de informações sobre a data (dia, mês e ano) */
@Suppress("unused")
const val NUMERO_INFORMACOES_DATA = NUMERO_INFORMACOES

/*
	 * Numero de ano para o qual um ano informado com 2 digitos deve ser
	 * inter pretado como cendo do seculo atual ou anterior
	 */
const val ANO_SEPARACAO_ENTRE_SECULOS = 50

/** Número de milissegundos em um minuto  */
const val MILISSEGUNDOS_MINUTO = 60000L

/** Número de milissegundos em uma hora  */
const val MILISSEGUNDOS_HORA = 3600000L

/** Número de milissegundos de um dia  */
const val MILISSEGUNDOS_DIA = 86400000L

/** Número de milissegundos de um mês  */
const val MILISSEGUNDOS_MES = 2592000000L

/** Constanet para complementar o ano da data Juliana.  */
@Suppress("unused")
const val COMPLEMENTO_ANO = "20"

/*
	 * Constantes utilizadas pelo método incrementaData para saber em que
	 * formato a data deve ser incrementada
	 */
const val HORA = Calendar.HOUR_OF_DAY

const val DIA = Calendar.DAY_OF_MONTH

const val MES = Calendar.MONTH

const val ANO = Calendar.YEAR

/** Contante que representa o dia de segunda feira na semana  */
const val SEGUNDA = Calendar.MONDAY

/** Contante que representa o dia de treça feira na semana  */
const val TERCA = Calendar.TUESDAY

/** Contante que representa o dia de quarta feira na semana  */
const val QUARTA = Calendar.WEDNESDAY

/** Contante que representa o dia de quinta feira na semana  */
const val QUINTA = Calendar.THURSDAY

/** Contante que representa o dia de sexta feira na semana  */
const val SEXTA = Calendar.FRIDAY

/** Contante que representa o dia de sábado feira na semana  */
const val SABADO = Calendar.SATURDAY

/** Contante que representa o dia de domingo feira na semana  */
const val DOMINGO = Calendar.SUNDAY

val mesesCom31Dias: List<Int> = listOf(Calendar.JANUARY,
    Calendar.MARCH,
    Calendar.MAY,
    Calendar.JULY,
    Calendar.AUGUST,
    Calendar.OCTOBER,
    Calendar.DECEMBER)


val MESES_COM_30_DIAS: List<Int> = listOf(
    Calendar.APRIL,
    Calendar.JUNE,
    Calendar.SEPTEMBER,
    Calendar.NOVEMBER
)

fun valorPreenchido(valor: String?): Boolean {
    return valor != null && valor.trim { it <= ' ' }.isNotEmpty()
} // valorPreenchido()

fun valorPreenchidoNoZero(valor: String?): Boolean{
    return valor != null && !(valor.trim().equals("0")) && (valor.trim().length != 0)
} // valorPreenchidoNoZero

fun ehNullOuVazio(valor: Any?): Boolean{
    return valor == null || valor.toString().trim().equals("")
} // ehNullOuVazio

fun ehNullOuVazio(valor: Collection<Any>?): Boolean{
    return valor.isNullOrEmpty()
} // ehNullOuVazio
fun ehNullOuVazio(valor: Map<Any,Any>?): Boolean{
    return valor.isNullOrEmpty()
} // ehNullOuVazio
fun verificaDiaDaSemana(data: Date, diaDaSemana: Int): Boolean{
    var calendario: Calendar = Calendar.getInstance()
    calendario.time = data
    return calendario.get(Calendar.DAY_OF_WEEK) == diaDaSemana
} // ehNullOuVazio

fun obterDataFromatada(mascara: String, data: Date): String? {
    val dataFormatada: SimpleDateFormat = SimpleDateFormat(mascara)
    return dataFormatada.format(data)
} // ehNullOuVazio