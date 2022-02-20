package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrama {
    String palavra;

    public Anagrama(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    //estabelece todas as substrings que uma palavra possui
    List<String>  definirSubstrings(){
        List<String> substrings = new ArrayList();

        for(int i = 0; i<this.getPalavra().length() - 1; i++){
            for(int j = 1; j<this.getPalavra().length(); j++){
                substrings.add(this.getPalavra().substring(i,j));
            }
        }
        return substrings;
    }

    //compara cada uma das substrings entre si, para formar os pares de anagramas
    int definirPares(List<String> substrings){
        int pares = 0;
        for(int i=0; i<substrings.size()-1; i++){
            for(int j=0; j<substrings.size(); j++){
                if(substrings.get(i).length() == substrings.get(j).length()){
                    for(int k = 0; k<substrings.get(i).length(); k++){
                        char c = substrings.get(i).charAt(k);
                        if(!substrings.get(j).contains(Character.toString(c)))
                            break;
                    }
                    pares++;
                }
            }
        }
        return pares;
    }
}
