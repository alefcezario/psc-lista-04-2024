import java.util.Scanner;

public class Exercicio3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite seu nome com mais que 3 caracteres: ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite sua idade entre 0 e 150:");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite seu salário maior que zero: ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Digite seu sexo sendo:");
            System.out.println("(f) para Feminino");
            System.out.println("(m) para masculino");
            sexo = scanner.next().charAt(0);
            sexo = Character.toLowerCase(sexo); 
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Digite seu estado civil de acordo com as seguintes letras:");
            System.out.println("( s ) para solteiro");
            System.out.println("( c ) para casado");
            System.out.println("( v ) para viúvo");
            System.out.println("( d ) divorciado");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil); 
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');


        System.out.println("Seus dados são:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " +String.format("%.2f",salario));
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close(); 
    }

}
