public class DeluxPizza extends Pizza {
    public DeluxPizza(int basePrice) {
        super(basePrice);
        // Automatically includes extras
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        isCheeseAdded = true;
    }

    @Override
    public void addExtraToppings() {
        isToppingsAdded = true;
    }
}
