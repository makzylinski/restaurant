public class Main {
    public static void main(String[] args) {
//        Meal standard = new Meal();
//        standard.printMeal();
//        System.out.println("Total Price is $" + standard.getTotalPrice());

//        Meal standard = new Meal();
//        System.out.printf("Your total price is $%.2f", standard.getTotalPrice());

        Meal custom = new Meal(false);
        System.out.printf("Your total price is $%.2f", custom.getTotalPrice());

    }
}
