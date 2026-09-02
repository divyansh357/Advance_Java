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
        K obj = (i,j) -> i+j; 
        int res = obj.add(5, 4);
        System.out.println(res);

    }
    
}