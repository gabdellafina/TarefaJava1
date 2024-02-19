import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        int fat = 1;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        for (int i = num; i > 0; i--){
            fat *= i;
        }

        System.out.println("O fatorial de "+num+" é: "+fat);
    }
}
