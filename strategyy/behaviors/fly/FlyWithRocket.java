package strategy.behaviors.fly;

import strategy.interfaces.FlyBehavior;

public class FlyWithRocket implements FlyBehavior{
    public void fly(){
        System.out.println("I 'm flying with rocket booster!!!");
    }
}