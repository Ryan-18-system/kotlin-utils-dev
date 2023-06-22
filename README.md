# Modificadores em Kotlin
### Autor: Ryan Nóbrega Brandão
Neste documento, você encontrará um overview sobre a linguagem Kotlin para ajudar na disciplina de Programação para Dispositívos móveis, além disso
será disponibilizado alguns métodos e padrões que possam ajudar na sua codificação.

## val
O modificador `val` é usado para declarar propriedades ou variáveis imutáveis. Uma vez que um valor é atribuído a uma propriedade ou variável com o modificador `val`, ele não pode ser alterado posteriormente.

Exemplo:

```kotlin
val pi = 3.14159
val nome = "João"
val idade: Int
idade = 3 
```

## var
O modificador `var` é usado para declarar propriedades ou variáveis mutáveis. 
Uma vez que um valor é atribuído a uma propriedade ou variável com o modificador var, ele pode ser alterado posteriormente.

```kotlin
var nome: String = "Ryan Nóbrega"
nome = "Novo Nome teste"
```

## const
No Kotlin, as constantes são declaradas usando o modificador const. 
Elas são usadas para armazenar valores que são conhecidos e não mudam durante o tempo de execução do programa. As constantes têm algumas características específicas:

1. Avaliação em tempo de compilação: As constantes são avaliadas durante a compilação e seus valores são inseridos diretamente no código gerado. Isso significa que as constantes são resolvidas em tempo de compilação, em vez de tempo de execução.

2. Escopo limitado: As constantes podem ser declaradas em nível de arquivo `arquivo.kt`, dentro de um objeto `object`, dentro de um companion object `companion object` ou em uma classe utilizando a palavra-chave const `const`.

3. Restrições de tipo: As constantes podem ser declaradas apenas com tipos primitivos ou tipos cujos construtores possam ser avaliados em tempo de compilação. `Byte`, `Short`,`Int`, `Int`, `Long`, `Float`, `Double`, `Char`, `Boolean`

4. Acesso direto: As constantes podem ser acessadas diretamente pelo nome, sem a necessidade de uma instância de objeto.

5. Boas práticas de nomenclatura: É comum nomear as constantes em letras maiúsculas com palavras separadas por underline para melhor legibilidade.

```kotlin
const val PI = 3.14159
const val NOME = "João"
const val IDADE: Int = 25
//Nesse exemplo, as constantes PI e NOME são declaradas no nível de arquivo. Elas podem ser acessadas de qualquer lugar dentro do arquivo.
```
```kotlin
object Constantes {
    const val PI = 3.14159
    const val NOME = "João"
}
Constantes.PI
```
```kotlin
class Exemplo {
    companion object {
        const val IDADE = 25
        const val EMAIL = "exemplo@gmail.com"
    }
}
Exemplo.IDADE
```
```kotlin
class MinhaClasse {
    const val MAXIMO = 100
    const val NOME = "Kotlin"
}
val instancia = MinhaClasse() 
instancia.MAXIMO
```








