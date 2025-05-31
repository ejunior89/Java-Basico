public class OperadoresAritmeticos {
  int a = 10 + 5; // Adição
  int b = 10 - 5; // Subtração
  int c = 10 * 5; // Multiplicação
  int d = 10 / 5; // Divisão
  int e = 10 % 5; // Módulo (resto da divisão)
  int f = 10 + 5 * 2; // Precedência de operadores (multiplicação antes da adição)
  int g = (10 + 5) * 2; // Uso de parênteses para alterar a precedência
  double h = 10.0 / 3.0; // Divisão com números decimais
  double i = 10.0 % 3.0; // Módulo com números decimais

  public static void main(String[] args) {
    OperadoresAritmeticos op = new OperadoresAritmeticos();
    System.out.println("Adição: " + op.a);
    System.out.println("Subtração: " + op.b);
    System.out.println("Multiplicação: " + op.c);
    System.out.println("Divisão: " + op.d);
    System.out.println("Módulo: " + op.e);
    System.out.println("Precedência de operadores (10 + 5 * 2): " + op.f);
    System.out.println("Uso de parênteses ((10 + 5) * 2): " + op.g);
    System.out.println("Divisão com números decimais (10.0 / 3.0): " + op.h);
    System.out.println("Módulo com números decimais (10.0 % 3.0): " + op.i);
  }

  /**
   * O que esse programa faz?
   * Esse programa demonstra o uso de operadores aritméticos em Java.
   * Ele realiza operações de adição, subtração, multiplicação, divisão e módulo,
   * além de mostrar a precedência de operadores e o uso de parênteses.
   * A saída será os resultados dessas operações impressos no terminal.
   */
}
