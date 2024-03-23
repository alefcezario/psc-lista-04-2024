import java.util.Scanner;

public class Exercicio8 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");

        int soma = 0, numero;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();

            soma += numero;
        }

        media = (double) soma / 5;

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);
        scanner.close(); 
    }
}
