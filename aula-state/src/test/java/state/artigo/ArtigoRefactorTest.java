package state.artigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArtigoRefactorTest {

    @Test
    public void shouldArtigoChangeStateFromRascunhoToAprovado() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        ArtigoRefactor artigo = new ArtigoRefactor();

        assertTrue(artigo.getState() instanceof RascunhoState);

        gs.setUser("AUTOR");
        artigo.publicar();

        assertTrue(artigo.getState() instanceof RevisandoState);

        gs.setUser("MODERADOR");
        artigo.publicar();

        assertTrue(artigo.getState() instanceof AprovadoState);
    }
}
