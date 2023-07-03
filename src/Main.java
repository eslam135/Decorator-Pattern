public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        pizza = new PepperoniDecorator(pizza);
        pizza = new MushroomDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Price: $" + pizza.getPrice());
    }
}