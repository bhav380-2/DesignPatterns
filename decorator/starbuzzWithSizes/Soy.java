package decorator.starbuzzWithSizes;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage ){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }

    public double cost(){
        double cost =  beverage.cost() + .15;
        if(size == Size.TALL){
            cost +=.1;

        }else if(size == Size.GRAND){
            cost += .15;
            
        }else{
            cost += .20;
        }
        return cost;
    }
}