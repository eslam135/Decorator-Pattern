public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    public double getPrice() {
        return pizza.getPrice() + 1.99;
    }
}
