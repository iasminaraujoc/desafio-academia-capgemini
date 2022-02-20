package questao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscadaTest extends Escada{
    Escada escada = new Escada(3);

    public EscadaTest(int tamanho) {
        super(tamanho);
    }

    @Test
    void verificarImpressao(){
        assertEquals("  *\n **\n***", escada.imprimeEscada());
    }
}