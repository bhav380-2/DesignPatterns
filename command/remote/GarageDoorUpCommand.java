package command.remote;

public class GarageDoorUpCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoo){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }
}