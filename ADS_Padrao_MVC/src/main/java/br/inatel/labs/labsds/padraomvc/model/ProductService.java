package br.inatel.labs.labsds.padraomvc.model;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    @PostConstruct
    private void setup() {
        Product p1 = new Product(1L, "Furadeira", 300.00);
        Product p2 = new Product(2L, "Lixadeira", 200.00);
        Product p3 = new Product(3L, "Serra Circular", 500.00);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
