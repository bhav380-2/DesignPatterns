package decorator.starbuzzWithSizes;

public abstract class Beverage{

    public enum Size {TALL, GRAND, VENTI}
    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription(){
        return description;
    }
    public abstract double cost();

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
}