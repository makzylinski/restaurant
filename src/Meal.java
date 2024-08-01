public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();

        pickDrink();
        pickSideDish();

        printMeal();
    }

    public Meal(boolean deluxeBurger) {
        this.burger = new Burger(deluxeBurger);
        this.drink = new Drink();
        this.sideItem = new SideItem();
        this.makeMeal();
    }

    public void printMeal() {
        burger.printMeal();
        drink.printMeal();
        sideItem.printMeal();
    }

    public void printPriceLists() {
        System.out.println("=== Burger Menu ===");
        burger.burgerListMenu();
        System.out.println("=== Toppings ===");
        burger.getListOfToppings();
        System.out.println("=== Drinks Menu ===");
        drink.getListOfDrinks();
        System.out.println("=== Side Dish ===");
        sideItem.getListOfItems();
    }

    public double getTotalPrice() {
        return (burger.getPrice() + drink.getPrice() + sideItem.getPrice());
    }

    private void makeMeal() {
        makeBurger();
        pickDrink();
        pickSideDish();
    }

    public void makeBurger() {
        burger.assembleBurger();
        burger.addToppings();
    }

    public void pickDrink() {
        drink.pickDrink();
    }

    public void pickSideDish() {
        sideItem.pickSideItem();
    }
}
