package state.artigo;

public class RascunhoState implements State {
    private ArtigoRefactor artigo;

    public RascunhoState(ArtigoRefactor artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        if(gs.isUserAutor())
            artigo.setState(new RevisandoState(artigo));
        else
            throw new RuntimeException("not allowed");
    }

    @Override
    public void reprovar() {
        return;
    }
}
