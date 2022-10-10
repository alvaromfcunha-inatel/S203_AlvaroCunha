package pizzabuilder;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setSize(Integer size) {
        this.pizza.setSize(size);
        return this;
    }

    public PizzaBuilder addCheese() {
        this.pizza.setHasCheese(true);
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pizza.setHasPepperoni(true);
        return this;
    }

    private void validateSize() {
        Integer size = this.pizza.getSize();
        if(!(size >= 1 && size <= 3)) {
            throw new IllegalStateException("Invalid size.");
        }
    }

    private void validateIngredient() {
        if(!(this.pizza.getHasCheese() || this.pizza.getHasPepperoni())) {
            throw new IllegalStateException("At least one ingredient (Cheese or Pepperoni).");
        }
    }

    public Pizza getPizza() {
        validateSize();
        validateIngredient();
        return this.pizza;
    }
}