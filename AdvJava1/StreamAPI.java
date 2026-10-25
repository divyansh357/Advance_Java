package AdvJava1;

import java.util.*;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(6,1,5,3,2,4);

        // forEach() method  - takes a Consumer object 

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        // this can be reduced with the help of lamda expression
        Consumer<Integer> con = (n)->  System.out.println(n);
        
        
        
            
        

        nums.forEach(con);

    }
}
