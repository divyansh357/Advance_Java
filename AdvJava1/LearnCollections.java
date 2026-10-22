package AdvJava1;

import java.util.*;

public class LearnCollections {
    public static void main(String[] args) {
        //Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<>(); // for more specific methods use specific classes or interfaces 
        // nums.add(10);
        // nums.add(25);
        // nums.add(10);
        // nums.add(89);

        // for(Object n : nums){
        //     int num = (Integer) n;
        //     System.out.println(num*10);
        // }
        // System.out.println(nums.get(0));
        // System.out.println(nums.contains(10));
        // System.out.println(nums.indexOf(25));

        // Set 
        // Set<Integer> set = new HashSet<>(); // unique , unordered
        // set.add(10);
        // set.add(25);
        // set.add(10);
        // set.add(89);

        //System.out.println(set);

        Set<Integer> set = new TreeSet<>(); // unique , ordered
        set.add(10);
        set.add(25);
        set.add(10);
        set.add(89);

        // System.out.println(set);

        // Iterator Interface

        Iterator<Integer> values = set.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }



    }

}
