package questao2;

public class Senha {
    String conteudo;

    public Senha(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    //método que compara a senha de entrada com os requisitos do sistema
    public int validarSenha(){
        int tamSenha = conteudo.length();
        int tamMinimo = 6;
        if (tamSenha<tamMinimo) {
            return tamMinimo - tamSenha;
        }
        return 0;
    }


}
