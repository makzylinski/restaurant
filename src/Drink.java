import java.util.Scanner;

public class Drink {
    private String size;
    private String type;
    private double price;

    public Drink() {
        this.type = "sprite";
        this.size = "small";
        this.price = 1.99;
    }

    public double getPrice() {
        return price;
    }

    public void getListOfDrinks() {
        System.out.printf("%s%n".repeat(5),
                "1) CocaCola - $1.99", "2) Beer - $2.99", "3) Sprite - $1.99", "4) 7UP - $1.99", "5) Wine - $5.99");
    }

    public void pickDrink() {
        getListOfDrinks();
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Pick your Drink: ");
        String selectedDrink = s.nextLine();
        switch (selectedDrink) {
            case "1" -> {
                System.out.println("You picked CocaCola, price $1.99");
                type = "cocacola";
                price += 1.99;
            }
            case "2" -> {
                System.out.println("You picked Beer, price $2.99");
                type = "beer";
                price += 2.99;
            }
            case "3" -> {
                System.out.println("You picked Sprite, price $1.99");
                type = "sprite";
                price += 1.99;
            }
            case "4" -> {
                System.out.println("You picked 7UP, price $1.99");
                type = "7up";
                price += 1.99;
            }
            case "5" -> {
                System.out.println("You picked Wine, price $5.99");
                type = "wine";
                price += 5.99;
            }
            default -> System.out.println("Error occurred.");
        }

        System.out.println(price);
        pickDrinksSize(type);
    }

    public void pickDrinksSize(String type) {
        System.out.println("How big do you want your " + type + "?");
        Scanner s = new Scanner(System.in);
        System.out.printf("%s%n".repeat(3), "1) Big +$2", "2) Medium + $1", "3) Small (no additional costs)");
        String selectedSize = s.nextLine();

        switch (selectedSize) {
            case "1" -> {
                price += 2;
                size = "big";
                System.out.println("You selected Big, $2 was added to your bill");
            }
            case "2" -> {
                price += 1;
                size = "medium";
                System.out.println("You selected Medium, $1 was added to your bill");
            }
            case "3" -> {
                size = "small";
                System.out.println("You selected Small, no additional costs");
            }

            default -> System.out.println("Error occurred");
        }

        System.out.println(price);
    }

    public void printMeal() {
        System.out.println("Drink " + type + ", size: " + size + " costs $" + price);
    }
}
