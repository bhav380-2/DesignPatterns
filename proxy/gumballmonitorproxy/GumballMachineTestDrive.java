package proxy.gumballmonitorproxy;

import java.rmi.*;

/**
 * Proxy Pattern :- Provides a placeholder or surrogate for another object to control access to it.
 * 
 * Design Principles:-
 1. Encapsulate what varies
 2. Favor composition over inheritance
 3. Program to interface not implementation
 4. Strive for loosely coupled design between objects that intreact
 5. Class should be open for extension but closed for modification
 6. Do not depend on concrete classes. Depend on abstraction
 7. Principle of least knowledge. Only talk to your immediate friends
 8. Hollywood Principle. Don't call use we'll call you
 9. Single Responsibility Principle. Clas should handle only one responsibility
 * 
 */

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
			GumballMachineRemote gumballMachine = new GumballMachine(args[0],count);
            Naming.rebind("//"+args[0]+"/gumballmachinee",gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
		}
    }
}
