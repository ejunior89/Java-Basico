public class OperadoresAritmeticos {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    System.out.println("a + b = " + (a + b)); // Adição
    System.out.println("a - b = " + (a - b)); // Subtração
    System.out.println("a * b = " + (a * b)); // Multiplicação
    System.out.println("a / b = " + (a / b)); // Divisão
    System.out.println("a % b = " + (a % b)); // Módulo (resto)

    double x = 10.0;
    double y = 3.0;
    System.out.println("x / y = " + (x / y)); // Divisão com números decimais

    String nome = "João";
    String sobrenome = "Silva";
    System.out.println("Nome completo: " + nome + " " + sobrenome); // Concatenação de strings
  }

  /**
   * O que esse programa faz?
   * Esse programa demonstra o uso de operadores aritméticos em Java.
   * Ele realiza operações de adição, subtração, multiplicação, divisão e módulo,
   * além de mostrar a precedência de operadores e o uso de parênteses.
   * A saída será os resultados dessas operações impressos no terminal.
   */
}
