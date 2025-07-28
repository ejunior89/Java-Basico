package poo;

public class TestePolimorfismo {
  public static void main(String[] args) {

    Carro meuCarroComum = new Carro("Gol", "Preto", 100);
    Carro meuCarroEsportivo = new Carro("Mclaren", "Vermelha", 200);
    // a classe Carro tem o metodo acelerar, que recebe um double
    // e aumenta a velocidade atual do carro em uma quantidade especificada
    // o metodo acelerar esta definido na classe Carro, mas pode ser sobrescrito
    // na classe CarroEsportivo, que herda de Carro
    // aqui estamos criando dois objetos do tipo Carro, um comum e outro esportivo
    // ambos objetos podem ser tratados como Carro, mas o CarroEsportivo
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
