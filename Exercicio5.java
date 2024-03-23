import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int populacaoPaisA, populacaoPaisB, numeroAnos = 0;
    double taxaCrescimentoA, taxaCrescimentoB;
    char permissaoRepetir;
    
    do{
        do {
            System.out.print("Digite a população inicial do país A: ");
            populacaoPaisA = scanner.nextInt();
            if (populacaoPaisA <= 0) {
                System.out.println("População inicial do país A deve ser maior que zero!");
            }
        } while (populacaoPaisA <= 0);

        do {
            System.out.println("Digite a taxa de crescimento anual para o país A (em decimal): ");
            taxaCrescimentoA = scanner.nextDouble();
            if (taxaCrescimentoA < 0) {
                System.out.println("A taxa de crescimento deve ser maior ou igual a zero!");
            }
        } while (taxaCrescimentoA < 0);


        do {
            System.out.print("Digite a população inicial do país B: ");
            populacaoPaisB = scanner.nextInt();
            if (populacaoPaisB <= 0) {
                System.out.println("População inicial do país B deve ser maior que zero.");
            }
        } while (populacaoPaisB <= 0);

        do {
            System.out.print("Digite a taxa de crescimento anual para o país B (em decimal): ");
            taxaCrescimentoB = scanner.nextDouble();
            if (taxaCrescimentoB < 0) {
                System.out.println("A taxa de crescimento deve ser maior ou igual a zero.");
            }
        } while (taxaCrescimentoB < 0);

        while (populacaoPaisA <= populacaoPaisB) {
            populacaoPaisA += (int) (populacaoPaisA * taxaCrescimentoA);
            populacaoPaisB += (int) (populacaoPaisB * taxaCrescimentoB);
            numeroAnos++;
        }

    System.out.println("Serão necessários "+numeroAnos+" anos para a população do País A ultrapassar ou igualar a população do País B");
    
    System.out.print("Deseja continuar? Pressione S para sim e N para não:");
    permissaoRepetir = scanner.next().charAt(0);

    } while (permissaoRepetir == 'S' || permissaoRepetir == 's');

    scanner.close(); 
}
}
