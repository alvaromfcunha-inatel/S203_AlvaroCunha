package state.artigo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Artigo {
    private String state;
    private List<String> logHistory = new ArrayList<>();

    public Artigo() {
        this.state = "RASCUNHO";
    }

    public void publicar() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        if("RASCUNHO".equals(this.state)) {
            if(gs.isUserAutor()) {
                this.state = "REVISANDO";
                this.logHistory.add("[State][publicar()][" + LocalDateTime.now() + "] RASCUNHO => REVISANDO");
            } else {
                throw new RuntimeException("user does not have access to this method");
            }
        } else if("REVISANDO".equals(this.state)) {
            if(gs.isUserModerador()) {
                this.state = "APROVADO";
                this.logHistory.add("[State][publicar()][" + LocalDateTime.now() + "] REVISANDO => PUBLICADO");
            } else {
                throw new RuntimeException("user does not have access to this method");
            }
        } /* else if("APROVADO".equals(this.state)) {
            return;
        } */

        return;
    }

    public void reprovar() {
        GerenteSeguranca gs = GerenteSeguranca.getInstance();
        if("RASCUNHO".equals(this.state)) {
            if(gs.isUserAutor()) {
                this.state = "RASCUNHO";
                this.logHistory.add("[State][reprovar()][" + LocalDateTime.now() + "] REVISANDO => RASCUNHO");
            } else {
                throw new RuntimeException("user does not have access to this method");
            }
        }

        return;
    }

    public String getState() {
        return this.state;
    }

    public List<String> getLogHistory() {
        return this.logHistory;
    }
}
