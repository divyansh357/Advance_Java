package AdvJava1;
class A extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
        }   
    }
}
class B extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
public class LearnThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //System.out.println(obj1.getPriority());

        //obj2.setPriority(1);
        obj1.setPriority(Thread.MAX_PRIORITY);
        

        // these two lines of code run parallelly with the help of threads
        obj1.start(); // starting thread execution with start() , it will call corresponding run()
        obj2.start();

        

    }
    
}
