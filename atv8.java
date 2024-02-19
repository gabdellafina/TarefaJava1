import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = ler.nextInt();

        for (int i = 1; i <= 2 * num - 1; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos primeiros " + num + " números ímpares é: " + soma);
    }5
}
