package singleton.chocolate;

// Singleton Pattern - Ensures a class has only one instance and provides
// a global point of access to it

// Design Principles:-
// 1. Encapsulate what varies
// 2. Favor Composition over inheritance
// 3. Program to interface not implementations
// 4. Strive for loosely coupled designs between object that interact
// 5. Classes should be open for extension but closed for modification
// 6. Depend on abstraction. Do not depend on concrete classes.

public class ChocolateController{
    public static void main(String[] args) {

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        // boiler.boil();/
        // boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();
    
    }
}