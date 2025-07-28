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


    // executar o programa
    // verificar se o carro está ligado ou desligado
    // verificar a velocidade atual do carro
    // verificar os dados do carro
    // verificar se o carro está acelerando ou não

    // Exemplo de uso do método acelerar com velocidade negativa
    Carro carroExemplo = new Carro("Toyota", "Corolla", 2021);
    carroExemplo.ligar();
    carroExemplo.acelerar(-10); // Tentativa de acelerar com velocidade negativa
    carroExemplo.exibirInformacoes();
  }
}
