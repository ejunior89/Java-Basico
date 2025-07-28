package poo;

public class TestePolimorfismo {
  public static void main(String[] args) {

    Carro meuCarroComum = new Carro("Fusca", "Preto", 100);
    Carro meuCarroEsportivo = new Carro("Mclaren", "Vermelha", 200);

    // a magica do polimorfismo
    Carro algumCarro = new Carro("Palio", "Azul", 90);
    algumCarro.acelerar(10.0);
    algumCarro = meuCarroComum;
    algumCarro.acelerar(10.0);
    algumCarro = meuCarroEsportivo;
    algumCarro.acelerar(20.0);
    System.out.println("Velocidade do " + meuCarroComum.getModelo() + ": " + meuCarroComum.getVelocidadeAtual());
    System.out.println("Velocidade do " + meuCarroEsportivo.getModelo() + ": " + meuCarroEsportivo.getVelocidadeAtual());
  }
}
