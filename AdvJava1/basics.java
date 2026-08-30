package AdvJava1;
abstract class Car{ // abstract Class
    public abstract void drive(); // abstract method
    public abstract void fly(); // abstract method
    public void playMusic(){ // concrete methods
        System.out.println("Play Music");
    }
}
abstract class WagonR extends Car { // abstract Class
    public void drive(){
        System.out.println("Driving...");
    }
}
class UpdatedWagonR extends WagonR{ // concrete class
public void fly() {
    System.out.println("Flying...");
}

}
public class basics{
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.playMusic();obj.drive();
        obj.fly();
        
    }
}
