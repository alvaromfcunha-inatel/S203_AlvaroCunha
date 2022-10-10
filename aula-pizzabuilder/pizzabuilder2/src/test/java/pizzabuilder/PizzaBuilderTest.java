package pizzabuilder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PizzaBuilderTest {
    @Test
    public void validSizeCheesePepperoniPizza() {
        Pizza p = new PizzaBuilder()
                .setSize(1)
                .addCheese()
                .addPepperoni()
                .getPizza();

        assertNotNull(p);
        assertNotNull(p.getSize());
        assertTrue(p.getHasCheese());
        assertTrue(p.getHasPepperoni());
    }

    @Test
    public void validSizeCheesePizza() {
        Pizza p = new PizzaBuilder()
                .setSize(2)
                .addCheese()
                .getPizza();

        assertNotNull(p);
        assertNotNull(p.getSize());
        assertTrue(p.getHasCheese());
    }

    @Test
    public void validSizePepperoniPizza() {
        Pizza p = new PizzaBuilder()
                .setSize(3)
                .addPepperoni()
                .getPizza();

        assertNotNull(p);
        assertNotNull(p.getSize());
        assertTrue(p.getHasPepperoni());
    }

    @Test(expected = IllegalStateException.class)
    public void zeroSizePizza() {
        new PizzaBuilder()
            .setSize(0)
            .addPepperoni()
            .getPizza();
    }

    @Test(expected = IllegalStateException.class)
    public void fourSizePizza() {
        new PizzaBuilder()
            .setSize(4)
            .addPepperoni()
            .getPizza();
    }

    @Test(expected = IllegalStateException.class)
    public void noIngredientPizza() {
        new PizzaBuilder()
            .setSize(1)
            .getPizza();
    }
}