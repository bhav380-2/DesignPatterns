// Strategy Pattern - Defines a family of Algorithms , encapsulates each one, and makes them interchangable. 
// Strategy lets the algorithm vary independently from the clients that use it.


// Design principles :- 
// 1. Separate out what varies and encapsulate it.
// 2. Program to an interface not to an implementation
// 3. Favor composition over inheritance

package strategy;
import strategy.behaviors.fly.FlyWithRocket;

public class MiniDuckSimulator{
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();//
        model.performFly();
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();
    }
}