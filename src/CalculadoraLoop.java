import java.util.Scanner;

public class CalculadoraLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';  // controla se o programa repete ou não

        while (continuar == 's' || continuar == 'S') {
            // Entrada do primeiro número
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            // Entrada do segundo número
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Entrada da operação
            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            // Processa a operação
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            // Pergunta se o usuário quer continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Calculadora encerrada.");
        scanner.close();
    }
}
