package singleton.enumS;

public enum Singleton{
    UNIQUE_INSTANCE;

    public String getDescription(){
        return "I'm a Singleton declared using enum!";
    }
}