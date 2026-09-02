package AdvJava1;

@FunctionalInterface
interface K{
    //void show(int i);
    int add(int i , int j);

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
        int i=0;
        int j=0;

        try{
            j= 18/i; // critical statement
        }
        catch(Exception e){ // executes only when exception is thrown
            System.out.println("Something went wrong..");
        }

        System.out.println(j);
        System.out.println("Exceptional Handling");

    }
    
}