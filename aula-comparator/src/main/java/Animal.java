public class Animal {
    private Long id;
    private String nome;

    public Animal(Long id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Animal (id=" + this.id + " | nome=" + this.nome + ")";
    }
}
