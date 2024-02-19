import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        String senha = "Java123";
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senhaDig = ler.nextLine();

        while (!senhaDig.equals(senha)) {
            System.out.print("Digite a senha: ");
            senhaDig = ler.nextLine();  
        }

        System.out.println("Senha correta!");
    }
}
