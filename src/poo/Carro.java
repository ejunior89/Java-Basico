package poo;

public class Carro {
    // 1. Atributos (características do Carro)
    String cor;
    String modelo;
    int ano;
    double velocidadeAtual; // Em km/h
    boolean estaLigado; // true se ligado, false se desligado

    // 2. Métodos (comportamentos do Carro)

    // Método para ligar o carro
    public void ligar() {
        if (!estaLigado) { // Se o carro não estiver ligado
            this.estaLigado = true; // Muda o estado para ligado
            System.out.println(this.modelo + " ligado.");
        } else {
            System.out.println(this.modelo + " já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (estaLigado) { // Se o carro estiver ligado
            this.estaLigado = false; // Muda o estado para desligado
            this.velocidadeAtual = 0; // Zera a velocidade ao desligar
            System.out.println(this.modelo + " desligado.");
        } else {
            System.out.println(this.modelo + " já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        if (estaLigado) {
            this.velocidadeAtual += incremento; // Aumenta a velocidade
            System.out.println(this.modelo + " acelerando. Velocidade atual: " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("Não é possível acelerar. O " + this.modelo + " está desligado.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Carro ---");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Status: " + (this.estaLigado ? "Ligado" : "Desligado"));
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
        System.out.println("--------------------------");
    }

    // Construtor para inicializar o carro
    public Carro(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; // Inicializa a velocidade em 0
        this.estaLigado = false; // Inicializa o carro desligado
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Carro meuCarro = new Carro("Vermelho", "Fusca", 1970);
        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.acelerar(20);
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    
}