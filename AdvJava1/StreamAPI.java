package AdvJava1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        //List<Integer> nums = Arrays.asList(6,1,5,3,2,4);

        // forEach() method  - takes a Consumer object 

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        // this can be reduced with the help of lamda expression
        // Consumer<Integer> con = (n)->  System.out.println(n);
        
        // // for interating through a Arraylist

        // nums.forEach(con);

        // we can directly craete the Consumer object inside forEach()
        //nums.forEach(n -> System.out.println(n));


        // Using Streams(single use then it dies)

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e)->c+e);

        
        // we can shorten this down by chaining
        // int result = nums.stream()
        //                  .filter(n -> n%2==0)
        //                  .map(n -> n*2)
        //                  .reduce(0,(c,e)->c+e);

        // System.out.println(result);


        // Map , filter , reduce and sorted

        // this can be reduced through lamda expression

        // filter() expecting predicate object
        // Predicate<Integer> p = new Predicate<Integer>() {
        //     @Override 
        //     public boolean test(Integer n) {
        //         return n%2==0;
        //     }
            
        // };

        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {

        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }
            
        // };

        // map() expecting 

        //  int result = nums.stream()
        //                  .filter(p)
        //                  .map(fun)
        //                  .reduce(0,(c,e)->c+e);


        // sorted() method                 
        // Stream<Integer> sorted = nums.stream().sorted();                 

        // sorted.forEach(n->System.out.println(n));

        // System.out.println(result);


        // Parallel Stream 
        int size = 10_000; 
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random(); // generate a random number
        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }

        //System.out.println(nums);
        
        // int sum1 = nums.stream()
        //                .map(i->i*2)
        //                .reduce(0,(c,e)->c+e);

        // Using Sequential Stream
        long startSeq = System.currentTimeMillis(); //  current system time in milli - second
        int sum2 = nums.stream()
                       .map(i->i*2)
                       .mapToInt(i->i) // returns an object of IntStream
                       .sum(); // returns the sum of IntStream

        long endSeq = System.currentTimeMillis();               


        //Using parallel Stream  
        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream() // multiple Thread perform the operation so its fast
                       .map(i->i*2)
                       .mapToInt(i->i)
                       .sum();                     
            
        long endPara = System.currentTimeMillis();           
                       
        System.out.println(sum2 + " "+ sum3);               
        System.out.println("Sequential Stream time taken : "+ (endSeq-startSeq));

        System.out.println("Parallel Stream time taken : "+ (endPara-startPara));
        
        
        
        

    }
}
