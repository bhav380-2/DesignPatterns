package decorator.starbuzz;

// Decorator - Attach additional responsibilities to an object dynamically
// Provides flexible alternative to subclassing for extending functionality.

// Design Principles :-
// 1. Encapsulate what varies
// 2. Favor composition over inheritance
// 3. Program to interface not an implementation
// 4. Strive for loosely coupled designs between objects that interact
// 5. Classes should be open for extension but closed for modification


public class StarbuzzCoffee {
    public static void main(String[]args){

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        // todo - Factory and Builder pattern (better way of creating decorated objects)
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage3.getDescription() +" $ "+beverage3.cost());
    }
}