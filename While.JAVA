import java.util.Scanner;
public class While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int resp; // decalara variavel de controle
        String nome;
        int idade;
        resp = 1; // inicializa a variavel de controle.

        while(resp == 1) {
            System.out.println("Digite o seu nome:");
            nome = input.next();
            System.out.println("Digite sua idade:"); idade = input.nextInt();

            if(idade >= 18){
                System.out.println("Seu nome eh: " + nome);
            }

            System.out.println("Deseja continuar?(1/0): ");
            resp = input.nextInt();
        }
        input.close();
    }
}