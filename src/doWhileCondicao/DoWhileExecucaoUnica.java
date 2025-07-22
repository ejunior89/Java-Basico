package doWhileCondicao;

public class DoWhileExecucaoUnica {
  public static void main(String[] args) {
    // Exemplo de execução única com do-while
    boolean condicaoParaRepetir = false;

    System.out.println("Iniciando o Programa...");

    do {
      System.out.println("Bem-vindo ao loop do-while!");
    } while (condicaoParaRepetir);
    // A condição é falsa, então o loop não será executado novamente

    System.out.println("Fim do Loop.");
  }
}
