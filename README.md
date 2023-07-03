# <span style = "color:cyan" > Decorator Pattern </span>

## <span style = "color:pink" >What is the Decorator Pattern? </span>

### <span style="color:lightgrey">The Decorator pattern is a structural design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is used to wrap an object with new behaviors without changing the existing code of the object.</span>

## <span style = "color:pink" >Why is it used?</span>

### <span style="color:lightgrey"> It is used to add or remove behaviors from individual objects, rather than changing the behavior of an entire class. This makes it more flexible and reusable than creating multiple subclasses with different variations of behavior. For example, it can be used to add toppings to a pizza object without modifying the original "Pizza" class or creating multiple subclasses for each variation of the pizza.

## <span style = "color:pink" > How does it work?

### <span style="color:lightgrey"> 1- Identify the behavior to add or remove:
Determine the behavior that needs to be added or removed from an individual object. In the pizza example, this could be adding or removing toppings.

### <span style="color:lightgrey"> 2- Define the Component interface:
Create an interface or abstract class that defines the methods of the object that the behavior needs to be added to. This interface will be implemented by the concrete component class. In the pizza example, the Component interface would define methods like "getDescription()" and "getPrice()".

### <span style="color:lightgrey"> 3- Implement the concrete component class:
Create a concrete class that implements the Component interface. This class will provide the base behavior of the object. In the pizza example, the concrete component class would be the "MargheritaPizza" class.

### <span style="color:lightgrey"> 4- Create the decorator abstract class:
Create an abstract class that implements the Component interface and contains a reference to the component object. This abstract class will be extended by the concrete decorator classes. In the pizza example, the decorator abstract class would be the "PizzaDecorator" class.

### <span style="color:lightgrey"> 5- Implement the concrete decorator classes:
Create separate classes for each behavior that needs to be added or removed, extending the decorator abstract class. Each concrete decorator class will provide its own implementation of the behavior. For example, you could have concrete decorator classes for adding pepperoni, mushrooms, or any other topping. In the pizza example, the concrete decorator classes would be the "PepperoniDecorator" and "MushroomDecorator" classes.

### <span style="color:lightgrey"> 6- Wrap the component object with decorators:
Create an object of the concrete component class, and then wrap it with one or more decorator objects. Each decorator object adds a specific behavior or functionality to the original object, and the decorators can be stacked or combined in any order. In the pizza example, we could create a "MargheritaPizza" object and then wrap it with a "PepperoniDecorator" and a "MushroomDecorator" to add the corresponding toppings.

### <span style="color:lightgrey"> 7- Call the methods of the decorated object:
Call the methods of the decorated object to execute the added behavior. In the pizza example, we could call the "getDescription()" and "getPrice()" methods of the decorated object to get the final description and price of the pizza with all the added toppings.

https://www.plantuml.com/plantuml/svg/SoWkIImgAStDuNBAJrBGjLDmpCbCJbMgKj5ZCj5ZDmpCpEJb9G0tJYp9BpKfDIWfDIWfDIWrIgt9BpKfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIXxZ9BpKfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWrIgv9BpKfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWfDIWrBZAvhA2J5G00
