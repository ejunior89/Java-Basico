public class MinhasVariaveis {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    int numeroConvidados = 50;
    String nomeAniversariante = "João";
    double custoEstimado = 1500.75;
    boolean teraMusicaAoVivo = false;

    numeroConvidados = 60; // Atualizando o número de convidados

    System.out.println("Número de convidados: " + numeroConvidados);
    System.out.println("Nome do aniversariante: " + nomeAniversariante);
    System.out.println("Custo estimado da festa: R$ " + custoEstimado);
    System.out.println("Terá música ao vivo? " + teraMusicaAoVivo);

    String meuHobby; // Declarando uma variável de hobby
    meuHobby = "Programar"; // Declarando uma variável de hobby
    System.out.println("Meu hobby: " + meuHobby);
  }
}