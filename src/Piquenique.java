import java.util.Scanner;

public class Piquenique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a temperatura em Celsius? "); // Use print para que a resposta fique na mesma linha
        double temperatura = scanner.nextDouble();

        System.out.print("Está chovendo? (sim/não): "); // Deixei claro o que esperar
        String respostaChuva = scanner.next();

        // Crie uma variável booleana baseada na String que você JÁ leu.
        // A variável 'estaChovendo' será true se a resposta for "sim" (ignorando maiúsculas/minúsculas).
        // Se a resposta for "sim" (ignorando maiúsculas/minúsculas), então 'estaChovendo' será true.
        boolean estaChovendo = respostaChuva.equalsIgnoreCase("sim");
        // Se a resposta for "não", então 'estaChovendo' será false.

        // Agora, construa a condição do piquenique
        // Relembrando a regra: temperatura > 20 E NÃO estiver chovendo
        if (temperatura > 20 && !estaChovendo) {
            System.out.println("É um bom dia para piquenique!");
        } else {
            System.out.println("Não é um bom dia para piquenique.");
        }
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}