package AdvJava1;

@FunctionalInterface
interface K{
    void show();
}
public class Intermediate{
    public static void main(String[] args) {
        K obj = new K(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
    
}