package QuizApp;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String choices[] = new String[5];
   
    public QuestionService(){
    questions[0]= new Question(
    "Q1",
    "Which language is platform independent?",
    "C",
    "C++",
    "Java",
    "Python",
    "Java"
);

questions[1] = new Question(
    "Q2",
    "Which keyword is used for inheritance in Java?",
    "this",
    "super",
    "extends",
    "implements",
    "extends"
);

questions[2] = new Question(
    "Q3",
    "Which method is the entry point of a Java program?",
    "start()",
    "main()",
    "run()",
    "execute()",
    "main()"
);

questions[3] = new Question(
    "Q4",
    "Which keyword is used to create an object?",
    "class",
    "object",
    "new",
    "create",
    "new"
);

questions[4] = new Question(
    "Q5",
    "Which of these is not a primitive data type?",
    "int",
    "char",
    "boolean",
    "String",
    "String"
);
}

public void playQuiz(){
    int j=0;
    for(Question q : questions){
        System.out.println("Question No . "+ q.getId());
        System.out.println(q.getQuestion());
        for(int i=0;i<4;i++){
            System.out.println(q.getOptions()[i]);
        }
        System.out.print("Enter your Answer: ");
        Scanner sc = new Scanner(System.in);
        choices[j]= sc.nextLine();
        j++;
    }
}
public void printScore(){
    int score =0;
    for(int i=0;i<questions.length;i++){
        Question ques = questions[i];
        String UserInput = choices[i];
        String answer = ques.getAns();
        if(answer.equals(UserInput)){
            score++;
        }
    }
    System.out.println("Your Score is: "+ score);
}
}
