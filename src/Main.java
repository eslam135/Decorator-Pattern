public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        pizza = new PepperoniDecorator(pizza);
        pizza = new MushroomDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription()); //Output : Margherita pizza, pepperoni, mushrooms
        System.out.println("Price: $" + pizza.getPrice()); // Output: 11.97
    }
}