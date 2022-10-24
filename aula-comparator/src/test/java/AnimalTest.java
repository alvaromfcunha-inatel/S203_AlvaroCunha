import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalTest {
    @Test
    public void deveListaAnimaisPeloNome() {
        List<Animal> lista = new ArrayList<Animal>();

        Animal tartaruga = new Animal(1L, "Tartaruga");
        Animal coelho = new Animal(2L, "Coelho");
        Animal cachorro = new Animal(3L, "Cachorro");
        Animal gato = new Animal(4L, "Gato");
        Animal girafa = new Animal(5L, "Girafa");
        Animal gato2 = new Animal(6L, "Gato");

        lista.add(tartaruga);
        lista.add(coelho);
        lista.add(cachorro);
        lista.add(gato);
        lista.add(girafa);
        lista.add(gato2);

        lista.forEach(System.out::println);

        lista.sort(new AnimalNameComparator());

        System.out.println();
        lista.forEach(System.out::println);
    }

    @Test
    public void deveListaAnimaisPeloId() {
        List<Animal> lista = new ArrayList<Animal>();

        Animal tartaruga = new Animal(15L, "Tartaruga");
        Animal coelho = new Animal(22L, "Coelho");
        Animal cachorro = new Animal(2L, "Cachorro");
        Animal gato = new Animal(46L, "Gato");
        Animal girafa = new Animal(35L, "Girafa");
        Animal gato2 = new Animal(76L, "Gato");

        lista.add(tartaruga);
        lista.add(coelho);
        lista.add(cachorro);
        lista.add(gato);
        lista.add(girafa);
        lista.add(gato2);

        lista.forEach(System.out::println);

//        lista.sort(new AnimalIdComparator());
        lista.sort(Comparator.comparing(Animal::getId));

        System.out.println();
        lista.forEach(System.out::println);
    }
}
