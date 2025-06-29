import java.util.Scanner;

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pizzamania");
        System.out.println("Which pizza: \n1. Veg Pizza \n2. Non-Veg Pizza \n3. Delux Veg Pizza \n4. Delux Non-Veg Pizza");
        System.out.print("===> ");
        int choice = sc.nextInt();
        Pizza pizza;

        switch (choice) {
            case 1:
                pizza = new Pizza(300);
                askForAddOns(sc, pizza);
                break;
            case 2:
                pizza = new Pizza(400);
                askForAddOns(sc, pizza);
                break;
            case 3:
                pizza = new DeluxPizza(550);
                askForTakeAway(sc, pizza);
                break;
            case 4:
                pizza = new DeluxPizza(650);
                askForTakeAway(sc, pizza);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        pizza.printBill();
    }

    public static void askForAddOns(Scanner sc, Pizza pizza) {
        System.out.print("Want Extra Topping (y/n)? => ");
        char topping = sc.next().charAt(0);
        if (topping == 'y' || topping == 'Y') {
            pizza.addExtraToppings();
        }

        System.out.print("Extra cheese (y/n)? => ");
        char cheese = sc.next().charAt(0);
        if (cheese == 'y' || cheese == 'Y') {
            pizza.addExtraCheese();
        }

        askForTakeAway(sc, pizza);
    }

    public static void askForTakeAway(Scanner sc, Pizza pizza) {
        System.out.print("Want TakeAway (y/n)? => ");
        char takeaway = sc.next().charAt(0);
        if (takeaway == 'y' || takeaway == 'Y') {
            pizza.takeAway();
        }
    }
}
