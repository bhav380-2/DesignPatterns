package iterator.dinermergercafe;

/**
 * Iterator Pattern - Provides a way to access the elements of an aggregate object
 * sequentially without exposing its underlying implementation.
 * 
 * 
 * Design Principles:
 * 1. Encapsulate what varies
 * 2. Favor composition over inheritance
 * 3. Program to interface not implementation
 * 4. Strive for loosely coupled design between objects that intreact
 * 5. Class should be open for extension but closed for modification
 * 6. Do not depend on concrete classes. Depend on abstraction
 * 7. Principle of least knowledge. Only talk to your immediate friends
 * 8. Hollywood Principle. Don't call use we'll call you
 * 9. Single Responsibility Principle. Class should handle only one responsibility
 * 
 */

public class MenuTestDrive{
    public static void main(String args[]){
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}