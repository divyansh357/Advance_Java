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

//Inner Class
class A{ //Illegal modifier for the class A; only public, abstract & final are permitted for outer class , cant be static
    private int num = 6;
    public void show(){
        System.out.println(num);
    } 

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }

}

//Anonymous Inner Class 
class C{
    public void show(){
        System.out.println("in A show");
    }
}



public class basics{
    public static void main(String[] args) {
        // Car obj = new UpdatedWagonR();
        // obj.playMusic();obj.drive();
        // obj.fly();

        // Inner Class 
        // A obj = new A();
        // obj.show();
        // //A.B obj1 = obj.new B();  // object creation for non static inner class  
        // A.B obj1 = new A.B(); // object creation for static inner class

        // obj1.config();

        //Anonymous Inner Class
        C obj = new C(){ // class without name and 
            public void show(){
                System.out.println("in anonymous class show");
            }
        };
        obj.show();
    }
}
