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


// Abstract and Anonymous Inner Class
abstract class D{
    public abstract void show();
    public abstract void config();

}

// Interface
interface E{
    int age = 21; // all variables implicitly final static
    String city = "Mumbai";
    void show(); // all methods implicitly public abstract
    void config();
}

interface G{
    void run();
}
interface H extends G{ // interface extending aanother interface

}

class F implements E,H{ // a class can implement multiple interfaces
    public void show() {
       System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("Running...");
    }
}

// Need of Interfaces
// abstract class Computer
// {
// //	public void code()
// //	{
// //		
// //	}
// 	public abstract void code();
// }

// class Laptop extends Computer
// {
// 	public void code()
// 	{
// 		System.out.println("code, compile, run");
// 	}

// }

// class Desktop extends Computer
// {
// 	public void code()
// 	{
// 		System.out.println("code, compile, faster");
// 	}
// }
// class Developer
// {
// //	public void devApp(Laptop lap)
// 	public void devApp(Computer lap)
// 	{
// 		lap.code();
// 	}
// }

// for this particular senario we can use computer interface - they craete a upper layer of abstraction(a general idea not based on any particular real person, thing or situation)
interface Computer
{
	void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

// Enums
enum Status{
    Running, Failed, Pending, Success; // 0 - index based numbering
}

// enum is a class

enum Laptops {
    Macbook(2500), XPS(1800) , Surface, ThinkPad(1700);
    private int price;
    
    private Laptops() {
        this.price = 500 ; // minimum price
    }

    private Laptops(int price) { // construtors are private because the object is created inside the same class
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

// Annotations
class I {
    public void showMyName(){
        System.out.println("Show I");
    }
}
class J extends I {

    @Override
    public void showMyName() { // The method showMyNam() of type J must override or implement a supertype method
        System.out.println("show J");
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
        // C obj = new C(){ // class without name 
        //     public void show(){
        //         System.out.println("in anonymous class show");
        //     }
        // };
        // obj.show();

        // Abstract and Anonymous Inner Class
        // D obj = new D(){  // this object is not of abstract class it is of anonymous inner class 
        //     public void show(){ 
        //         System.out.println("in new Show");
        //     }

        //     public void config() {
        //         System.out.println("in new config");
        //     }
        // };
        // obj.show();
        // obj.config();

        // Interfaces
        // E obj;
        // obj = new F();
        // obj.show();

        // H obj1;
        // obj1 = new F();
        // obj1.run();
        // obj.config();
        // System.out.println(E.age+ " "+ E.city);

        // Need Of Interfaces

        // Laptop lap=new Laptop();
        // Desktop desk=new Desktop();
        
    //     Computer lap=new Laptop();
    //     Computer desk=new Desktop();
        
    //     Developer navin = new Developer();
    //     navin.devApp(desk);

    // enums
    // Status s = Status.Running;
    // System.out.println(s);
    // System.out.println(s.ordinal()); // return the index of particular value 

    // Status[] ss = Status.values(); // returns all values from enum as an array 
    // for(Status m : ss){
    //     System.out.println(m + " : " + m.ordinal());
    // }

    // if else and switch with enums

    //Status s = Status.Failed;
    //if else 

    // if(s== Status.Running){
    //     System.out.println("In Processing");
    // }
    // else if(s== Status.Failed){
    //     System.out.println("Try again later");
    // }
    // else if(s== Status.Pending){
    //     System.out.println("Please wait");
    // }
    // else{
    //     System.out.println("Done");
    // }

    // switch case with enums
    // switch (s) {
    //     case Running:
    //         System.out.println("In Processing");
    //         break;
    //     case Failed:
    //         System.out.println("Try again");
    //         break;    
    //     case Pending:
    //         System.out.println("Please wait");
    //         break;
    //     default:
    //         System.out.println("Done");
    //         break;
    // }

    // enum is a class 

    // Status s = Status.Failed;
    // System.out.println(s.getClass().getSuperclass()); // enum class extends java.lang.Enum 

    // Laptops lap = Laptops.Macbook;
    // System.out.println(lap + " : "+ lap.getPrice());

    // Laptops[] ll = Laptops.values();
    // for(Laptops l : ll){
    //     System.out.println(l + " : " + l.getPrice());
    // }

    // Annotations
    // J obj = new J();
    // obj.showMyName();



}
}
