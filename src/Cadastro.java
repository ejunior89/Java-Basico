import java.util.Scanner;

public class Cadastro {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();

    if (idade >= 18) {
      System.out.println("é maior de idade: ");
    } else {
      System.out.println("é menor de idade: ");
    }

    entrada.close();
    System.out.println("Obrigado pelo cadastro, " + nome + "!");
  }
}
