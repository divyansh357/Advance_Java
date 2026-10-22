package AdvJava1;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {
        //Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<>(); // for more specific methods use specific classes or interfaces 
        nums.add(10);
        nums.add(25);
        nums.add(10);
        nums.add(89);

        for(Object n : nums){
            int num = (Integer) n;
            System.out.println(num*10);
        }
        System.out.println(nums.get(0));
        System.out.println(nums.contains(10));
        System.out.println(nums.indexOf(25));
    }

}
