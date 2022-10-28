package state.artigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArtigoRefactorTest {

    @Test
    public void shouldArtigoChangeStateFromRascunhoToAprovado() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        ArtigoRefactor artigo = new ArtigoRefactor();

        assertEquals("RASCUNHO", artigo.getState().toString());

        gs.setUser("AUTOR");
        artigo.publicar();

        assertEquals("REVISANDO", artigo.getState().toString());

        gs.setUser("MODERADOR");
        artigo.publicar();

        assertEquals("APROVADO", artigo.getState().toString());
    }
}
