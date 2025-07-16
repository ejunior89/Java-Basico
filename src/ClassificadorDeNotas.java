import java.util.Scanner;

public class ClassificadorDeNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");

        int nota = scanner.nextInt();
        String classificacao; // Variável para armazenar a classificação

        // Primeiro, valida a nota (melhor com if/else aqui)
        if (nota < 0 || nota > 100) {
            classificacao = "Nota inválida. Por favor, insira uma nota entre 0 e 100.";
        } else {
            // Se a nota for válida, usa o switch
            classificacao = switch (nota / 10) { // Para nota 100
                case 10, 9 ->  // Para notas de 90 a 99
                        "A";
                case 8 ->  // Para notas de 80 a 89
                        "B";
                case 7 ->  // Para notas de 70 a 79
                        "C";
                case 6 ->  // Para notas de 60 a 69
                        "D";
                default -> // Para notas de 0 a 59
                        "F";
            };
        }

        System.out.println(classificacao);
        scanner.close();
    }
}