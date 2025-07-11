public class ExemploIfElseIfElse {
  public static void main(String[] args) {
    int hora = 8;

    if (hora < 12) {
      System.out.println("Bom dia!");
    } else  if (hora < 18) {
      System.out.println("Boa tarde!!");
    } else {
      System.out.println("Boa noite!");
    }


  boolean temSol = true;
  boolean estaChovendo = false;

  if (temSol && estaChovendo) {
    System.out.println("Vou à praia, mas levarei um guarda-chuva.");
  } else if (temSol) {
    System.out.println("Vou à praia.");
  } else if (estaChovendo) {
    System.out.println("Ficarei em casa.");
  } else {
    System.out.println("Não sei o que fazer, talvez um filme.");
  }
  /**
   * O que esse programa faz?
   * Esse programa demonstra o uso de estruturas condicionais if, else if e else em Java.
   * Ele verifica a hora do dia e imprime uma saudação apropriada.
   * Também verifica as condições climáticas para decidir se vai à praia ou ficar em casa.
   * A saída será as mensagens correspondentes impressas no terminal.
   */
}
}