public class ExemploWhile {
  public static void main(String[] args) {
    int contador = 0;
    while (contador < 3) {
      System.out.println("Repetição while: " + contador);
      contador++;
    }

    System.out.println("\nExemplo de condição externa:");
    boolean temCafe = true;
    int xicaras = 0;
    while (temCafe && xicaras < 2) {
      System.out.println("Tomando café numero: " + (xicaras + 1));
      xicaras++;
      if (xicaras == 2) {
        temCafe = false; // Simula que o café acabou após 2 xícaras
      }
      System.out.println("Ainda tem café? " + temCafe);
    }
  }
}
