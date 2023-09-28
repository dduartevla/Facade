import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmeTest {

    @Test
    void deveRetornarCondicaoInvalida() {
        try {
            Condicao condicao = null;
            Alarme alarme = new Alarme();
            alarme.setCondicao(condicao);
            fail();

        } catch (IllegalArgumentException e) {
            assertEquals("CONDIÇÃO INVALIDA", e.getMessage());
        }
    }
}