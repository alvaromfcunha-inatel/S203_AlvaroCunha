package state.artigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArtigoTest {

    @Test
    public void shouldArtigoChangeStateFromRascunhoToAprovado() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        Artigo artigo = new Artigo();

        assertEquals("RASCUNHO", artigo.getState());

        gs.setUser("AUTOR");
        artigo.publicar();

        assertEquals("REVISANDO", artigo.getState());

        gs.setUser("MODERADOR");
        artigo.publicar();

        assertEquals("APROVADO", artigo.getState());
    }
}
