public class OperadoresComparacao {
  public static void main(String[] args) {
    int idade = 35;
    int idadeLimite = 18;
    int a = 10;
    int b = 5;

    System.out.println("a == b: " + (a == b)); // Igualdade
    System.out.println("a != b: " + (a != b)); // Diferença
    System.out.println("a > b: " + (a > b));   // Maior que
    System.out.println("a < b: " + (a < b));   // Menor que
    System.out.println("a >= b: " + (a >= b)); // Maior ou igual a
    System.out.println("a <= b: " + (a <= b)); // Menor ou igual a

    System.out.println("Idade é maior ou igual a 18? " + (idade >= idadeLimite)); // Verifica se a idade é maior ou igual ao limite
    System.out.println("Idade é menor que 18? " + (idade < idadeLimite)); // Verifica se a idade é menor que o limite
  }


}
