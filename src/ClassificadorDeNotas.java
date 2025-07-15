import java.util.Scanner;

public class ClassificadorDeNotas {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");

        int nota = scanner.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 100.");
        } else if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }
}
