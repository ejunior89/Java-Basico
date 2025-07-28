package poo;

public class Garagem {
  public static void main(String[] args) {
    // criando o primeiro objeto Carro : meuCarro
    // usando o construtor para inicializar
    Carro meuCarro = new Carro("Fiat", "Uno", 1999);
    System.out.println("Meu Uno: ");
    meuCarro.ligar();
    meuCarro.acelerar(20);
    meuCarro.exibirInformacoes();
    meuCarro.desligar();
    meuCarro.exibirInformacoes();

    // criando o segundo objeto Carro: carroDoVizinho
    Carro carroDoVizinho = new Carro("Chevrolet", "Onix", 2020);
    System.out.println("Carro do vizinho: ");
    carroDoVizinho.exibirInformacoes();
    carroDoVizinho.ligar();
    carroDoVizinho.acelerar(30);
    carroDoVizinho.exibirInformacoes();
    carroDoVizinho.desligar();
    carroDoVizinho.exibirInformacoes();

    // criando o terceiro objeto Carro: carroDoAmigo
    Carro carroDoAmigo = new Carro("Volkswagen", "Gol", 2018);
    System.out.println("Carro do amigo: ");
    carroDoAmigo.exibirInformacoes();
    carroDoAmigo.ligar();
    carroDoAmigo.acelerar(25);
    carroDoAmigo.exibirInformacoes();
    carroDoAmigo.desligar();
    carroDoAmigo.exibirInformacoes();

    //desafio criar um terceiro objeto Carro: carroDoPai
    Carro carroDoPai = new Carro("Ford", "Fiesta", 2015);
    System.out.println("Carro do pai: ");
    carroDoPai.ligar();
    carroDoPai.acelerar(40);
    carroDoPai.exibirInformacoes();
    carroDoPai.desligar();
    carroDoPai.exibirInformacoes();


    System.out.println("--------------------------");
    System.out.println("Tentando mudar o ano do carro do pai:");
    carroDoPai.setAno(2020);
    System.out.println("Ano alterado para: " + carroDoPai.getAno());

    System.out.println("--------------------------");
    System.out.println("Tentando mudar a cor do carro do vizinho:");
    carroDoVizinho.setCor("Azul");
    System.out.println("Cor alterada para: " + carroDoVizinho.getCor());
    System.out.println("--------------------------");
    System.out.println("Tentando mudar o modelo do carro do amigo:");
    carroDoAmigo.setModelo("Polo");
    System.out.println("Modelo alterado para: " + carroDoAmigo.getModelo());
    System.out.println("--------------------------");
    System.out.println("Tentando mudar a velocidade do meu carro:");
    meuCarro.setVelocidadeAtual(60);
    System.out.println("Velocidade alterada para: " + meuCarro.getVelocidadeAtual() + " km/h");
    System.out.println("--------------------------");
    System.out.println("Exibindo informações de todos os carros:");
    meuCarro.exibirInformacoes();
    carroDoVizinho.exibirInformacoes();
    carroDoAmigo.exibirInformacoes();
    carroDoPai.exibirInformacoes();
    System.out.println("--------------------------");
    System.out.println("Todos os carros foram exibidos com sucesso!");
    System.out.println("--------------------------");
    System.out.println("Fim do programa.");
    System.out.println("--------------------------");
    System.out.println("Minha Garagem de Carros");
    System.out.println("--------------------------");
    System.out.println("\n---- Carro de Corrida ----");
    CarroDeCorrida carroDeCorrida = new CarroDeCorrida("Amarelo", "Formula 1", 2022, true);
    carroDeCorrida.ligar();
    carroDeCorrida.acelerar(100);
    carroDeCorrida.ativarTurbo();
    carroDeCorrida.exibirInformacoes();
    carroDeCorrida.desligar();
    carroDeCorrida.exibirInformacoes();
    System.out.println("\n--- fim da Simulação da Garagem ---");
  }
}
