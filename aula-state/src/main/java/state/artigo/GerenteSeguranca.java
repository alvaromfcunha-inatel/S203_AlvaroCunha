package state.artigo;

public class GerenteSeguranca {
    private static GerenteSeguranca instance;

    private GerenteSeguranca() { }

    public static GerenteSeguranca getInstance() {
        if(instance == null)
            instance = new GerenteSeguranca();
        return instance;
    }

    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isUserModerador() {
        return "MODERADOR".equals(this.user);
    }

    public boolean isUserAutor() {
        return "AUTOR".equals(this.user);
    }
}
