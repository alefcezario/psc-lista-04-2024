import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolhaDirecao;

        System.out.println("Digite 1 para ver a sequencia de numeros 1 a 20 um abaixo do outro.");    
        System.out.println("Digite 2 para ver a sequencia de numeros 1 a 20 um ao lado do outro.");
        escolhaDirecao = scanner.nextInt();

        
        switch (escolhaDirecao) {
            case 1:
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
              }    
                break;
            case 2:
            for (int i = 1; i <= 20; i++) {
                System.out.print(i + " ");
            }
                break;  
            default:
            System.out.println("Opção Invalida");
                break;
        }
         

        scanner.close(); 
    }
}
