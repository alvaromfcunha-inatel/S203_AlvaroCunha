class PizzaBuilderTest {
    @Test
    void validSizeCheesePepperoniPizza() {
        Pizza p = new PizzaBuilder()
            .setSize(1)
            .addCheese()
            .addPepperoni()

        assertNotNull(p);
    }

    @Test
    void validSizeCheesePizza() {
        Pizza p = new PizzaBuilder()
            .setSize(2)
            .addCheese()

        assertNotNull(p);
    }

    @Test
    void validSizePepperoniPizza() {
        Pizza p = new PizzaBuilder()
            .setSize(3)
            .addPepperoni()

        assertNotNull(p);
    }

    @Test(expected = IllegalStateException.class)
    void zeroSizePizza() {
        Pizza p = new PizzaBuilder()
            .setSize(0)
            .addPepperoni()
    }

    @Test(expected = IllegalStateException.class)
    void fourSizePizza() {
        Pizza p = new PizzaBuilder()
            .setSize(4)
            .addPepperoni()
    }

    @Test(expected = IllegalStateException.class)
    void noIngredientPizza() {
        Pizza p = new PizzaBuilder()
            .setSize(1)
    }
}