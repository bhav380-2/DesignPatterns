package strategy;

import strategy.behaviors.fly.FlyWithWings;
import strategy.behaviors.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}