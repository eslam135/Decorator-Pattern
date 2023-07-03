public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", mushrooms";
    }

    public double getPrice() {
        return pizza.getPrice() + 0.99;
    }
}
