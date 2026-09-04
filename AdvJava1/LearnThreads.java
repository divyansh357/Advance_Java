package AdvJava1;

// Using thread by extesnding Thread class
class M extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {  e.printStackTrace();  }

        }   
    }
}
class N extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
             try {
                Thread.sleep(10);
            } catch (InterruptedException e) {  e.printStackTrace();  }

        }
    }
}


// Using thread by implementing the Runnable interface
class O implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {  e.printStackTrace();  }

        }   
    }
}

class P implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {  e.printStackTrace();  }

        }   
    }
}
public class LearnThreads {
    public static void main(String[] args) {
        // M obj1 = new M();
        // N obj2 = new N();

        // //System.out.println(obj1.getPriority());

        // //obj2.setPriority(1); // this is just a suggestion to scheduler , final class is made by by  the schedular based on the algo it is accomapnied with
        // obj1.setPriority(Thread.MAX_PRIORITY);
        

        // these two lines of code run parallelly with the help of threads
        // obj1.start(); // starting thread execution with start() , it will call corresponding run()
       
        // try {
        //       Thread.sleep(5);
        //     } catch (InterruptedException e) {  e.printStackTrace();  }

        // obj2.start();

        // Creating thread with Runnable Interface
        // Runnable obj1 = new O();
        // Runnable obj2 = new P();

        // // Creating a Thread class object to use thread methods and passing the reference of the Runnable reference with creates a link between these two 
        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start(); // calling the start() method from the Thread class which will call the run
        // t2.start();

        // Reducing code by Use of Lamba Expression - this is bit tricky to write directly first write the normal one and try reducing in steps 

        Runnable obj1 = ()-> 
         {
            for(int i=0;i<5;i++)
            {
               System.out.println("hi");
               try { Thread.sleep(10); } catch (InterruptedException e) {  e.printStackTrace();  }
            }   
         };

        Runnable obj2 = ()-> 
         {
            for(int i=0;i<5;i++)
            {
               System.out.println("hello");
               try { Thread.sleep(10); } catch (InterruptedException e) {  e.printStackTrace();  }
            }   
         };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();

        

    }
    
}
