package questao2;

import java.util.Scanner;

//testando os métodos da classe Senha com entrada e saída
public class SenhaMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.nextLine();

        Senha senha = new Senha(entrada);
        System.out.println(senha.validarSenha());
    }
}
