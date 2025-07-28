package poo;

public class CarroDeCorrida extends Carro {

  private boolean temTurbo;

  // construtor para CarroDeCorrida
  public CarroDeCorrida(String marca, String modelo, int ano, boolean temTurbo) {
    super(marca, modelo, ano);
    this.temTurbo = temTurbo;
  }

  // método para ativar o turbo
  public void ativarTurbo() {
        // Podemos usar métodos e atributos herdados da superclasse
        // Ex: this.isEstaLigado() para verificar se o carro está ligado
        if (this.temTurbo && this.isEstaLigado()) {
            System.out.println(this.getModelo() + " ativando turbo! Preparar para o boost!");
            // Podemos até acelerar mais usando o método herdado de Carro
            this.acelerar(50); // Adiciona um incremento extra de velocidade
        } else if (!this.temTurbo) {
            System.out.println(this.getModelo() + " não possui turbo.");
        } else {
            System.out.println("O " + this.getModelo() + " precisa estar ligado para ativar o turbo!");
        }
    }

  // método para exibir informações do carro de corrida
  @Override
  public void exibirInformacoes() {
    super.exibirInformacoes();
    System.out.println("Turbo: " + (temTurbo ? "Sim" : "Não"));
  }

  public boolean isTemTurbo() {
    return temTurbo;
  }

  public void setTemTurbo(boolean temTurbo) {
    this.temTurbo = temTurbo;
  }

}
