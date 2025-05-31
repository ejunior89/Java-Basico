public class OperadoresRelacionais {
  // Operadores relacionais em Java
  // a == b; // Igualdade: verifica se a é igual a b
  // a != b; // Desigualdade: verifica se a é diferente de b
  // a > b; // Maior que: verifica se a é maior que b
  // a < b; // Menor que: verifica se a é menor que b
  // a >= b; // Maior ou igual: verifica se a é maior ou igual
  // a <= b; // Menor ou igual: verifica se a é menor ou igual a b


  public static void main(String[] args) {
    int a = 5;
    int b = 10;

    System.out.println("a == b: " + (a == b)); // false
    System.out.println("a != b: " + (a != b)); // true
    System.out.println("a > b: " + (a > b));   // false
    System.out.println("a < b: " + (a < b));   // true
    System.out.println("a >= b: " + (a >= b)); // false
    System.out.println("a <= b: " + (a <= b)); // true
  }

  /**
   * Esse programa demonstra o uso de operadores relacionais em Java.
   * Ele compara duas variáveis, a e b, e imprime o resultado de cada comparação.
   * A saída será:
   * a == b: false
   * a != b: true
   * a > b: false
   * a < b: true
   * a >= b: false
   * a <= b: true
   */
}
