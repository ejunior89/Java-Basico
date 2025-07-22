package doWhileCondicao;

public class ContadorDoWhile {
  public static void main(String[] args) {
    System.out.println("Contando de 1 a 5 com do-while:");
    int contador = 1;
    do {
      System.out.println("Contando.. " + contador);
      contador++;
    } while (contador <= 5);
    System.out.println("Fim da contagem.");
  }
}
