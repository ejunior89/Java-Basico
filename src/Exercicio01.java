public class Exercicio01 {
  public static void main(String[] args) {

    int temperatura = 25;

    if (temperatura > 30) {
      System.out.println("Está muito calor! User protetor solar!!");
    } else {
      System.out.println("A temperatura está agradável.");
    }

    int idade = 17;

    if (idade < 13) {
      System.out.println("Você é menor de idade");
    } else if (idade >= 18) {
      System.out.println("Você é maior de idade");
    } else {
      System.out.println("Você é um adolescente");
    }
  }
}
