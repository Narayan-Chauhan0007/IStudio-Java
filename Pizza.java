public class Pizza {
    protected int basePrice;
    protected boolean isCheeseAdded = false;
    protected boolean isToppingsAdded = false;
    protected boolean isTakeAway = false;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
    }

    public void addExtraCheese() {
        isCheeseAdded = true;
    }

    public void addExtraToppings() {
        isToppingsAdded = true;
    }

    public void takeAway() {
        isTakeAway = true;
    }

    public int calculateTotal() {
        int total = basePrice;
        if (isCheeseAdded) total += 100;
        if (isToppingsAdded) total += 150;
        if (isTakeAway) total += 20;
        return total;
    }

    public void printBill() {
        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Pizza: " + basePrice);
        if (isCheeseAdded) System.out.println("Extra Cheese: 100");
        if (isToppingsAdded) System.out.println("Extra Toppings: 150");
        if (isTakeAway) System.out.println("Take Away: 20");
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println("\nThank you!!!! Visit Again.....");
    }
}
