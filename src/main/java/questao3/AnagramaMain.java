package questao3;

import java.util.Scanner;

//testando os métodos da classe Anagrama com entrada e saída
public class AnagramaMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.nextLine();

        Anagrama anagrama = new Anagrama(entrada);
        System.out.println(anagrama.definirPares(anagrama.definirSubstrings()));

    }
}
