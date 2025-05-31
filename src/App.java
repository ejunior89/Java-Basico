public class App {
    /**
     * public: modificador de acesso.
     *  Significa que qualquer outro código pode acessar essa classe.
     * class: palavra-chave pra declarar uma classe.
     * MeuPrograma: nome da classe (começa com maiúscula por convenção).
     * O nome do arquivo .java deve ser igual ao nome da classe pública (nesse caso: MeuPrograma.java).
     * Tudo em Java precisa estar dentro de uma classe.
     * static: não precisa instanciar a classe pra rodar o método.
     * main: método principal, ponto de entrada do programa.
     * String[] args: parâmetro que recebe argumentos da linha de comando.
     *String[] args: parâmetro que recebe argumentos de linha de comando (pode ignorar por agora).
      * System: classe que fornece acesso ao sistema.
      *out: fluxo de saída padrão (terminal).
       *println: imprime uma linha no terminal com quebra de linha.
       *"Olá, mundo!": texto que será impresso.
     */


        public static void main(String[] args) {
            String nome = "João";
            int idade = 25;

            System.out.println("Olá, " + nome);
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Bem-vindo ao meu programa!");
        }

    /** o que esse programa faz?
     * Esse programa imprime uma mensagem de boas-vindas no terminal.
     * Ele declara duas variáveis: nome e idade, e as utiliza para personalizar a mensagem.
     * A saída será:
     * Olá, João
     * Você tem 25 anos.
     * Bem-vindo ao meu programa!
     */

}
