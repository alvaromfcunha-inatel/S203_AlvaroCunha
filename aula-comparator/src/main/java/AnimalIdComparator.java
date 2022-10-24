import java.util.Comparator;

public class AnimalIdComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getId().compareTo(a2.getId());
    }
}
