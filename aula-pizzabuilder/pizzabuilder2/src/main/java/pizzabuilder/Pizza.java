package pizzabuilder;

public class Pizza {
    private Integer size = 0;
    private Boolean hasCheese = false;
    private Boolean hasPepperoni = false;

    public Integer getSize() {
        return this.size;
    }

    public Boolean getHasCheese() {
        return this.hasCheese;
    }

    public Boolean getHasPepperoni() {
        return this.hasPepperoni;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setHasCheese(Boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public void setHasPepperoni(Boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }
}