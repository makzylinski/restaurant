public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }

    public void printMeal() {
        burger.printMeal();
        drink.printMeal();
        sideItem.printMeal();
    }

    public double getTotalPrice() {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }
}
