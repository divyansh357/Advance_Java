package AdvJava1;

import java.util.*;

class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}
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

        // Set<Integer> set = new TreeSet<>(); // unique , ordered
        // set.add(10);
        // set.add(25);
        // set.add(10);
        // set.add(89);

        // System.out.println(set);

        // Iterator Interface

        // Iterator<Integer> values = set.iterator();

        // while (values.hasNext()) {
        //     System.out.println(values.next());
        // }

        // Map

        // Map<String,Integer> names = new HashMap<>();

        // names.put("Div", 80);
        // names.put("Chhavi", 85);
        // names.put("Harshit", 80);
        // names.put("Asmi", 90);
        // names.put("Chhavi",86);

        // System.out.println(names.keySet());

        // for(String key : names.keySet()){
        //     System.out.println(key + " : "+ names.get(key));
        // }

        // Map<String,Integer> names = new Hashtable<>(); // synchronized - if we have to make thread safe 

        //Comparator for Sorting
        // List<Integer> list = new ArrayList<>();

        // list.add(43);
        // list.add(31);
        // list.add(72);
        // list.add(29);

        // // personalized compare definition
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public  int compare(Integer i , Integer j){
        //         if(i%10 > j%10)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        // Collections.sort(list,com);
        // System.out.println(list);

        // for sorting strings based on length
        
        // List<String> list = new ArrayList<>();

        // list.add("Div");
        // list.add("Chhavi");
        // list.add("Asmi");
        // list.add("Harshit");

        // // personalized compare definition - diamond operator dont work for anynmous class
        // Comparator<String> com = new Comparator<String>() {
        //     public  int compare(String i , String j){
        //         if(i.length() > j.length())
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        // Collections.sort(list,com);
        // System.out.println(list);

        // Creating Student class

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"Div"));
        studs.add(new Student(20,"Chhavi"));
        studs.add(new Student(22,"Asmi"));
        studs.add(new Student(21,"Harshit"));

        // personalized compare definition - diamond operator dont work for anynmous class
        Comparator<Student> com = new Comparator<Student>() {
            public  int compare(Student i , Student j){
                if(i.age > j.age)
                    return 1;
                else 
                    return -1;
            }
        };

       Collections.sort(studs,com);
       for(Student s : studs) 
        System.out.println(s);




    }

}
