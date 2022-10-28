package state.artigo;

public class RevisandoState implements State {
    private ArtigoRefactor artigo;

    public RevisandoState(ArtigoRefactor artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        if(gs.isUserModerador()) {
            artigo.setState(new PublicadoState(artigo));
        } else {
            throw new RuntimeException("not allowed");
        }
    }

    @Override
    public void reprovar() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        if(gs.isUserModerador()) {
            artigo.setState(new RascunhoState(artigo));
        } else {
            throw new RuntimeException("not allowed");
        }
    }

    @Override
    public String toString() {
        return "REVISANDO";
    }
}
