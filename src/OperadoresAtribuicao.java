public class OperadoresAtribuicao {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    a += b; // Adição e atribuição
    System.out.println("a += b: " + a); // a agora é 15

    a -= b; // Subtração e atribuição
    System.out.println("a -= b: " + a); // a agora é 10

    a *= b; // Multiplicação e atribuição
    System.out.println("a *= b: " + a); // a agora é 50

    a /= b; // Divisão e atribuição
    System.out.println("a /= b: " + a); // a agora é 10

    a %= b; // Módulo e atribuição
    System.out.println("a %= b: " + a); // a agora é 0

    String nome = "Maria";
    nome += " Silva"; // Concatenação e atribuição
    System.out.println("Nome completo: " + nome); // Nome completo: Maria Silva

    int contador = 0;
    System.out.println("Contador depois de +=5: " + (contador += 5)); // Contador agora é 5

    System.out.println("Contador depois de -=2: " + (contador -= 2)); // Contador agora é 3
    System.out.println("Contador depois de *=3: " + (contador *= 3)); // Contador agora é 9
    System.out.println("Contador depois de /=3: " + (contador /= 3)); // Contador agora é 3
    System.out.println("Contador depois de %=2: " + (contador %= 2)); // Contador agora é 1
    /**
     * O que esse programa faz?
     * Esse programa demonstra o uso de operadores de atribuição em Java.
     * Ele realiza operações de adição, subtração, multiplicação, divisão e módulo
     * com atribuição, além de mostrar a concatenação de strings.
     * A saída será os resultados dessas operações impressos no terminal.
     */
  }
}
