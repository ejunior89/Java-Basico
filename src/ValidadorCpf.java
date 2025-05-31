import java.util.Scanner;

/*1. Ler o CPF
2. Remover pontos e traços
3. Verificar se tem 11 dígitos
4. Verificar se todos são iguais
5. Calcular dígitos verificadores
6. Comparar com os dígitos digitados
 */

public class ValidadorCpf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o CPF (apenas números): ");
    String cpf = scanner.nextLine();

    scanner.close();
    if (isValidCPF(cpf)) {
      System.out.println("CPF válido.");
    } else {
      System.out.println("CPF inválido.");
    }
  }

  private static boolean isValidCPF(String cpf) {
    // Remove caracteres não numéricos
    cpf = cpf.replaceAll("[^0-9]", "");

    // Verifica se o CPF tem 11 dígitos
    if (cpf.length() != 11) {
      return false;
    }

    // Verifica se todos os dígitos são iguais (ex: 11111111111)
    if (cpf.chars().distinct().count() == 1) {
      return false;
    }

    // Validação dos dígitos verificadores
    int[] cpfArray = new int[11];
    for (int i = 0; i < 11; i++) {
      cpfArray[i] = Character.getNumericValue(cpf.charAt(i));
    }

    // Cálculo do primeiro dígito verificador
    int soma = 0;
    for (int i = 0; i < 9; i++) {
      soma += cpfArray[i] * (10 - i);
    }
    int primeiroDigito = (soma * 10) % 11;
    if (primeiroDigito == 10) {
      primeiroDigito = 0;
    }

    // Cálculo do segundo dígito verificador
    soma = 0;
    for (int i = 0; i < 10; i++) {
      soma += cpfArray[i] * (11 - i);
    }
    int segundoDigito = (soma * 10) % 11;
    if (segundoDigito == 10) {
      segundoDigito = 0;
    }

    // Verifica se os dígitos verificadores estão corretos
    return cpfArray[9] == primeiroDigito && cpfArray[10] == segundoDigito;
  }
}
