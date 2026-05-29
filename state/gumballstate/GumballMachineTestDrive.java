package state.gumballstate;


/**
 * 
 * State Pattern - Allows an object to alter its behavior when its internal state changes.
 * The object will appears to change its class.
 * 
 * Design Principles:- 
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

public class GumballMachineTestDrive{

    public static void main(String args[]){
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}