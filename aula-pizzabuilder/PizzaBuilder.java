public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder size(Integer size) {
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
        if(!(this.size >= 1 && this.size <= 3)) {
            throw new IllegalStateException('Invalid size.')
        }
    }

    private void validateIngredent() {
        if(!(this.hasCheese || this.hasPepperoni)) {
            throw new IllegalStateException('At least one ingredient (Cheese or Pepperoni).')
        }
    }

    public Pizza getPizza() {
        validateSize();
        validateIngredent();
        return this.pizza;
    }
}