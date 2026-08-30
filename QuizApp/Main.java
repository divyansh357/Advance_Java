package QuizApp;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // System.out.println("Choose your identity, (A)admin or (B)User: ");
        // Scanner sc = new Scanner(System.in);
        // char ch = Character.toLowerCase(sc.next().charAt(0));
        // if(ch=='a'){
        // Admin obj1 = new Admin();
        //     System.out.println("Enter your name: ");
        //     obj1.setName(sc.nextLine());
        //     System.out.println("Enter your password: ");
        //     obj1.setPass(sc.nextLine());
        //     System.out.println("Now set the questions for the ");
        // }
        // else if(ch=='b'){
        //     User obj = new User();
        //     System.out.println("Enter your name: ");
        //     obj.setName(sc.nextLine());
        //     System.out.println("Enter your password: ");
        //     obj.setPass(sc.nextLine());
        //     Questions obj2 = new Questions();
        //     for(int i=1;i<=4;i++){
        //         obj2.getQuestion(i);
        //         System.out.println("Enter correct option A , B , C or D");
        //         char ans = Character.toLowerCase(sc.next().charAt(0));

        //     }
        // }

        QuestionService qs = new QuestionService();
        qs.playQuiz();



        
    }
}