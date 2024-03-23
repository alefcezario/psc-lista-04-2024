import java.util.Scanner;

public class Exercicio7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");

        int maiorNumero = Integer.MIN_VALUE, numero;

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
        scanner.close(); 
    }
}
