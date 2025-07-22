import java.util.ArrayList;

public class ListaArrays {
    public static void main(String[] args) {
        ArrayNumeros();
    }

    public static void ArrayNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (Integer numero : numeros) {
            System.out.println("Números: " + numero);
        }
    }
}
