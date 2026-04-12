package strategy.behaviors.quack;
import strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
    public void quack(){
        System.out.println("Squeak!!!");
    }
}