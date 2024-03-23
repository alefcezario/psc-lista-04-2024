import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
        System.out.println("Digite uma nota entre 0 e 10:");
        nota = scanner.nextInt();
        if (nota<0||nota>10) {
        System.out.println("Nota inválida!");
        }        
        }while(nota < 0 || nota > 10);

        System.out.println("A nota fornecida foi: " + nota);

        scanner.close(); 
    }
}
