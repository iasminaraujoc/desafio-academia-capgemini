package questao1;

public class Escada {
    int tamanho;

    public Escada(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //com base em um inteiro n, retorna uma string
    public String imprimeEscada(){
        String saida = "";
        int qtdeEspacos = 5, qtdeAsteriscos = 1;
        for(int i = 0; i<this.tamanho; i++){
            for(int j = 0; j<qtdeEspacos; j++){
                saida +=" ";
            }
            for(int k = 0; k<qtdeAsteriscos; k++){
                saida +="*";
            }
            saida += "\n";
            qtdeEspacos--;
            qtdeAsteriscos++;
        }
        return saida;
    }
}
