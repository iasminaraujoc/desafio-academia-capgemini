package questao3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest extends Anagrama{
    Anagrama anagrama = new Anagrama("ovo");

    public AnagramaTest(String palavra) {
        super(palavra);
    }

    @Test
    void verificarNumeroPares(){
        assertEquals(2, anagrama.definirPares(anagrama.definirSubstrings()));
    }
}