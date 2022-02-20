package questao1;

import java.util.Scanner;

//testando os métodos da classe Escada com entrada e saída
public class EscadaMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        Escada escada = new Escada(n);
        System.out.println(escada.imprimeEscada());
    }
}
