public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.assembleBurger();
        burger.addToppings();

        System.out.println("Your bill: $" + burger.getPrice());
    }
}
