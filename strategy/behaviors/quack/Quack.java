package strategy.behaviors.quack;
import strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack!!!");
    }
}