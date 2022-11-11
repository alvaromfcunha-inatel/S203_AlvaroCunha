package br.inatel.labs.labsds.padraomvc.model;

public class Product {
    private Long id;
    private String description;
    private Double price;

    public Product(Long id, String description, Double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
