import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';  // variável de controle do loop

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

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

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
        System.out.println("Obrigado por usar a calculadora simples!");
    }
}
