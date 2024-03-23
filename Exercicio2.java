import java.util.Scanner;

public class Exercicio2 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senhaUsuario;

        System.out.println("Digite seu nome de usuário: ");
        nomeUsuario = scanner.nextLine();
        System.out.println("Agora digite sua senha: ");
        senhaUsuario = scanner.nextLine();

        while (senhaUsuario.equals(nomeUsuario)) {
            System.out.println("A senha não pode ser igual ao nome de usuário");
            System.out.println("Digite sua senha novamente: ");
            senhaUsuario = scanner.nextLine();
        }
        System.out.println("Seu cadastro foi realizado!");
        scanner.close(); 
    }

}
