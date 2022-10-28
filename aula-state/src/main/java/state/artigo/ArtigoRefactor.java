package state.artigo;

public class ArtigoRefactor {
    private State state;

    public ArtigoRefactor() {
        state = new RascunhoState(this);
    }

    public void publicar() {
        state.publicar();
    }

    public void reprovar() {
        state.reprovar();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
