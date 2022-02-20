package questao2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenhaTest extends Senha{
    Senha senha = new Senha("Ya3");

    public SenhaTest(String conteudo) {
        super(conteudo);
    }

    @Test
    void verificarValidacaoSenha(){
        assertEquals(3, senha.validarSenha());
    }
}