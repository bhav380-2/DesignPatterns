package singleton.subclass;

public class Singleton{
    protected static Singleton uniqueInstance;
    protected Singleton(){}
    public static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
            System.out.println("Singleton created!!!");
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}