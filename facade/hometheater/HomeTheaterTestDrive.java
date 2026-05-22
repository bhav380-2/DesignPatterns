package facade.hometheater;


/**
 * Facade Pattern - Provides a unified interface to a set of interfaces in the subsystem. 
 * Facade defines a high level interface that makes the subsystem easier to use.
 * 
 * Design Principles -
 * 1. Encapsulate what varies
 * 2. Favor composition over inheritance
 * 3. Program to an interface not implementation
 * 4. Strive for loosely coupled design between objects that interface
 * 5. Classes should be open for extension but closed for modification
 * 6. Do not depend on concrete classes. Depend on abstraction
 * 7. Principle of least knowledge. Talk only to your immediate friends.
 * 
 */
public class HomeTheaterTestDrive{

    public static void main(String[] args){
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner",amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player",amp);
        CdPlayer cd = new CdPlayer("CD Player",amp);

        Projector projector = new Projector("Projector",player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");

        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("popcorn popper");
         
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,tuner,player,projector,screen,lights,popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}