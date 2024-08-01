import java.util.Scanner;

public class Burger {
    private String type;
    private double price = 0.0;
    private String topping = "";

    public double getPrice() {
        return price;
    }

    public void getListOfToppings() {
        System.out.printf("%s%n".repeat(5), "1) pickles", "2) lettuce", "3) onion", "4) tomato", "5) ketchup");
    }

    public void addToppings() {
        getListOfToppings();
        System.out.println("Please, add toppings by inputting the number, 3 are free of charge, each additional to this number" +
                "will be charged + $0.5");
        System.out.println("Select Q to quit");


        int toppingCounter = 0;
        double extraToppingCost = 0.0;

        for(int i = toppingCounter; i < 5; i++) {
            Scanner s = new Scanner(System.in);
            System.out.print("Please, select your topping: ");
            String selectedTopping = s.nextLine();

            if(selectedTopping.contains("Q")) {
                break;
            }

            switch (selectedTopping) {
                case "1" -> {
                    topping += "pickles, ";
                }
                case "2" -> {
                    topping += "lettuce, ";
                }
                case "3" -> {
                    topping += "onion, ";
                }
                case "4" -> {
                    topping += "tomato, ";
                }
                case "5" -> {
                    topping += "ketchup, ";

                }
                default -> System.out.println("Wrong input");
            }

            if(i >= 2) {
                System.out.println("You've reached free 3 toppings, any extra will cost you +$0.5");
            }

            if(i >= 3) {
                extraToppingCost += 0.5;
                System.out.println("Your bill is extended by $" + extraToppingCost);
            }

            System.out.println("Your toppings: " + topping);
        }

        price += extraToppingCost;
    }

    public void assembleBurger() {
        System.out.println("Please, assemble your burger");

        System.out.println("Select S for Small Burger, price: $4.99");
        System.out.println("Select M for Medium Burger, price: $6.99");
        System.out.println("Select L for Large Burger, price: $8.99");

        Scanner s = new Scanner(System.in);
        System.out.print("Pick your Burger: ");
        String selectedBurger = s.nextLine();
        switch (selectedBurger) {
            case "S" -> {
                System.out.println("You picked Small Burger, price $4.99");
                type = "small";
                price += 4.99;
            }
            case "M" -> {
                System.out.println("You picked Medium Burger, price $6.99");
                type = "medium";
                price += 6.99;
            }
            case "L" -> {
                System.out.println("You picked Large Burger, price $8.99");
                type = "large";
                price += 8.99;
            }
            default -> System.out.println("Error occurred.");
        }

        System.out.println("Your Burger order is " + type.substring(0, 1).toUpperCase() + type.substring(1) + " Burger, price is $" + price);

    }
}
