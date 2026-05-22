package adapter.ducks;

import adapter.ducks.challenge.Drone;
import adapter.ducks.challenge.DroneAdapter;
import adapter.ducks.challenge.SuperDrone;

/**
 * 
 * Adapter Pattern - Converts the interface of a class into another interface clients expects.
 * Lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * Design Principles -
 * 1. Encapsulate what varies
 * 2. Favor composition over inheritance
 * 3. Program to an interface not implementation
 * 4. Strive for loosely coupled design between objects that interface
 * 5. Classes should be open for extension but closed for modification
 * 6. Do not depend on concrete classes. Depend on abstraction
 * 7. Principle of least knowledge. Talk only to your immediate friends.
 */

public class DuckTestDrive{

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says...");
        testDuck(duck);

        System.out.println("\n The Turkey Adapter says...");
        testDuck(turkeyAdapter);

        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        System.out.println("\n The drone Adapter says...");
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}