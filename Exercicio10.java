import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    int numeroInicial, numeroFinal;

        System.out.println("Digite o numero que começará o intervalo:");
        numeroInicial = scanner.nextInt();
        System.out.println("Digite o numero que Finalizará o intervalo:");
        numeroFinal = scanner.nextInt();

      for (int i = numeroInicial; i <= numeroFinal; i++) {
        System.out.println(i);
      }   

      scanner.close(); 
    }
}
