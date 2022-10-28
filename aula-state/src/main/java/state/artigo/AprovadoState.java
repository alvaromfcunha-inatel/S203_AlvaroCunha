package state.artigo;

public class AprovadoState implements State {
    private ArtigoRefactor artigo;

    public AprovadoState(ArtigoRefactor artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        return;
    }

    @Override
    public void reprovar() {
        return;
    }
}
