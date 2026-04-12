package strategy.behaviors.quack;
import strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("Silence !!!");
    }
}