public class OperadoresLogicos {
  public static void main(String[] args) {
    int idade = 16;
    boolean temCNH = true;
    boolean podeDirigir = idade >= 18 && temCNH; // Verifica se a pessoa pode dirigir

    boolean temDinheiro = true;
    boolean podeComprarCarro = podeDirigir || temDinheiro; // Verifica será que a pessoa pode comprar um carro
    System.out.println("Pode comprar carro? " + podeComprarCarro); // Imprime se a pessoa pode comprar um podeComprarCarro
    System.out.println("Pode dirigir? " + podeDirigir); // Imprime se a pessoa pode dirigir
    if (podeDirigir) {
      System.out.println("Você pode dirigir.");
    } else {
      System.out.println("Você não pode dirigir.");
      }
    }
    /**
     * O que esse programa faz?
     * Esse programa demonstra o uso de operadores lógicos em Java.
     * Ele verifica se uma pessoa pode dirigir com base na idade e na posse de CNH,
     * e se pode comprar um carro com base na possibilidade de dirigir ou ter dinheiro.
     * A saída será os resultados dessas verificações impressos no terminal.
     */
  }
