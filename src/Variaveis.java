public class Variaveis {
  int idade = 25; // Variável inteira
  Double altura = 1.75; // Variável de ponto flutuante
  String nome = "João"; // Variável de texto
  boolean estudante = true; // Variável booleana (verdadeiro ou falso)
  char inicial = 'J'; // Variável de caractere (um único caractere)
  String[] hobbies = {"futebol", "leitura", "programação"}; // Array de strings (lista de hobbies)
  int[] numeros = {1, 2, 3, 4, 5}; // Array de inteiros (lista de números)
  String saudacao = "Olá, " + nome + "!"; // Concatenando strings para criar uma saudação
  String mensagem = "Você tem " + idade + " anos e sua altura é " + altura + " metros."; // Mensagem formatada com variáveis
  String hobbiesList = "Seus hobbies são: " + String.join(", ", hobbies); // Lista de hobbies formatada
  String numerosList = "Números: " + java.util.Arrays.toString(numeros); // Lista de números formatada
  String estudanteStatus = "Você é estudante? " + (estudante ? "Sim" : "Não"); // Verificando se é estudante e formatando a resposta

  public static void main(String[] args) {
    Variaveis variaveis = new Variaveis();

    // Imprimindo as variáveis
    System.out.println(variaveis.saudacao);
    System.out.println(variaveis.mensagem);
    System.out.println(variaveis.hobbiesList);
    System.out.println(variaveis.numerosList);
    System.out.println(variaveis.estudanteStatus);
  }
  
  /*  esses são exemplos de variáveis em Java, cada uma com seu tipo e uso específico.
  * * idade: variável inteira que armazena a idade de uma pessoa.
  * * altura: variável de ponto flutuante que armazena a altura de uma pessoa.
  * * nome: variável de texto que armazena o nome de uma pessoa.
  * * estudante: variável booleana que indica se a pessoa é estudante (verdadeiro ou falso).
  * * inicial: variável de caractere que armazena a inicial do nome da pessoa.
  * * hobbies: array de strings que armazena uma lista de hobbies da pessoa.
  * * numeros: array de inteiros que armazena uma lista de números.
  * * saudacao: string que concatena o nome com uma saudação personalizada.
  * * mensagem: string que formata uma mensagem com a idade e altura da pessoa.
  * * hobbiesList: string que formata uma lista de hobbies.
  * * numerosList: string que formata uma lista de números.
  * * estudanteStatus: string que verifica se a pessoa é estudante e formata a resposta.
  */
}
