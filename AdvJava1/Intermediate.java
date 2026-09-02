package AdvJava1;

@FunctionalInterface
interface K{
    //void show(int i);
    int add(int i , int j);

}

// Custom Exception 
class DivyanshException extends Exception{ // extends Exception class or RuntimeException our choice
    public DivyanshException(String s){
        super(s); // calls super class (throwable) constructor
    }
}
// Ducking the Exception - throws keyword 
class L{
    public void show() throws ClassNotFoundException{
        Class.forName("Southern");
    }
}
public class Intermediate{
    public static void main(String[] args) {
        //K obj =  (int i) -> System.out.println("in show "+ i); 
        //K obj =  i -> System.out.println("in show "+ i); 
        //obj.show(5);

        // lamda Expression with returning function 
        // K obj = (i,j) -> i+j; 
        // int res = obj.add(5, 4);
        // System.out.println(res);

        //Exception Handling Using try Catch 
        int i=20;
        int j=0;
        // int arr[] =  new int[5];
        // String str = null;

        // try{
        //     //j= 18/i; // critical statement
        //     System.out.println(arr[5]);  // critical statement
        //     //System.out.println(str.length()); // critical statement

        // }

        // // multiple catch blocks to handle different types of exception with customised messages
        // catch(ArithmeticException e){ // executes only when exception is thrown
        //     System.out.println("Cannot divide by zero.");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Be in your limits.");
        // }
        // catch(Exception e){
        //     System.out.println("Something Went Wrong. "+ e);
        // }

        // System.out.println(j);
        // System.out.println("Exceptional Handling");


        // throw keyword 
        // try {
        //     j= 18/i;
        //     if(j==0)
        //         throw new ArithmeticException("I dont want to print zero."); // throw exception with modified message 
        // } 
        // catch (ArithmeticException e) {
        //     j=18/1; // Handling exception with a solution 
        //     System.out.println("Thats the default output. "+ e);
        // }
        // catch(Exception e){
        //     System.out.println("Something went Wrong. "+ e);
        // }
        // System.out.println(j);
        // System.out.println("Byee");

        // Custom Exception 

        // try {
        //     j= 18/i;
        //     if(j==0)
        //         throw new DivyanshException("I dont want to print zero."); // throw custom exception
        // } 
        // catch (DivyanshException e) {
        //     j=18/1; // Handling exception with a solution 
        //     System.out.println("Thats the default output. "+ e);
        // }
        // catch(Exception e){
        //     System.out.println("Something went Wrong. "+ e);
        // }
        // System.out.println(j);
        // System.out.println("Byee");

        // Ducking Exception by using throws keyword
        L obj = new L();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. "+ e);  // Class not found. java.lang.ClassNotFoundException: Southern
            e.printStackTrace(); // print the whole method calling stack - for debugging 
        }




    }
    
}