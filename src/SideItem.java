import java.util.Scanner;

public class SideItem {
    private String type;
    private double price = 0.0;

    public SideItem() {
        this.type = "fries";
        this.price = 1.99;
    }

    public double getPrice() {
        return price;
    }

    public void getListOfItems() {
        System.out.printf("%s%n".repeat(5),
                "1) Fries - $1.99", "2) Coleslaw - $2.99", "3) Chili - $3.99", "4) Mashed Potatoes - $4.99", "5) Chips - $5.99");
    }

    public void pickSideItem() {
        getListOfItems();
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Pick your Side Item: ");
        String selectedSideItem = s.nextLine();
        switch (selectedSideItem) {
            case "1" -> {
                System.out.println("You picked Fries, price $1.99");
                type = "fries";
                price += 1.99;
            }
            case "2" -> {
                System.out.println("You picked Coleslaw, price $2.99");
                type = "coleslaw";
                price += 2.99;
            }
            case "3" -> {
                System.out.println("You picked Chili, price $3.99");
                type = "chili";
                price += 3.99;
            }
            case "4" -> {
                System.out.println("You picked Mashed Potatoes, price $4.99");
                type = "mashed potatoes";
                price += 4.99;
            }
            case "5" -> {
                System.out.println("You picked Chips, price $5.99");
                type = "chips";
                price += 5.99;
            }
            default -> System.out.println("Error occurred.");
        }

        System.out.println(price);
    }

    public void printMeal() {
        System.out.println("Side Item " + type + " costs $" + price);
    }
}
