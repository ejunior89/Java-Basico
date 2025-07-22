public class EstruturaCondicionais {

    public static void main(String[] args) {

      int idade = 18;
      boolean isAutorizadoComprarBebida = idade >= 18;

      if (isAutorizadoComprarBebida) {
        System.out.println("Você está autorizado a comprar bebida alcoólica.");
      } else {
        System.out.println("Você não está autorizado a comprar bebida alcoólica.");
      }

      if (!isAutorizadoComprarBebida) {
        System.out.println("Você não pode comprar bebida alcoólica agora.");
      }
      boolean c = false;
      if (c == true){
        System.out.println("Dentro de algo que nunca deve ser feito.");
      }

      System.out.println("fora do if");
    }
}