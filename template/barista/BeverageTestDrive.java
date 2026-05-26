package template.barista;

/**
 * Template Method Pattern - Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 
 * Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 * 
 * Design Principles - 
 * 1. Encapsulate what varies
 * 2. Favor composition over inheritance
 * 3. Program to interface not implementation
 * 4. Strive for loosely coupled design between objects that intreact
 * 5. Class should be open for extension but closed for modification
 * 6. Do not depend on concrete classes. Depend on abstraction
 * 7. Principle of least knowledge. Only talk to your immediate friends
 * 8. Hollywood Principle. Don't call use we'll call you
 */

public class BeverageTestDrive{
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n Making tea ...");
        tea.prepareRecipe();

        System.out.println("\n Making coffee...");
        coffee.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n Making tea...");
        teaHook.prepareRecipe();

        System.out.println("\n Making coffee...");
        coffeeHook.prepareRecipe();
    }

}