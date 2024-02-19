import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++){
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();
        }

        System.out.print("Digite o nome que deseja pesquisar: ");
        String nome6 = ler.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nome6)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome está na lista dos 5 nomes iniciais.");
        } else {
            System.out.println("O nome não está na lista dos 5 nomes iniciais.");
        }
    }
}
