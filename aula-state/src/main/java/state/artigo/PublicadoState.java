package state.artigo;

public class PublicadoState implements State {
    private ArtigoRefactor artigo;

    public PublicadoState(ArtigoRefactor artigo) {
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

    @Override
    public String toString() {
        return "PUBLICADO";
    }
}
