package QuizApp;

public class Questions {
    private String questions[][] = new String[5][6]; // Each admin can have set of five questions and four options corresponding to each ques
    public void setQuestion(int questionNo, String question,
                        String option1, String option2,
                        String option3, String option4,
                        String correctAnswer) {

    questions[questionNo][0] = question;
    questions[questionNo][1] = option1;
    questions[questionNo][2] = option2;
    questions[questionNo][3] = option3;
    questions[questionNo][4] = option4;
    questions[questionNo][5] = correctAnswer;
}
public void getQuestion(int i){
    System.out.println(this.questions[i][0]+". "+ this.questions[i][1]);
    System.out.println("Options: ");
    char ch = 'A';
    for(int j=1;j<questions[1].length-2;j++){
        System.out.println(ch +". " +questions[i][j]);
        ch++;
    }
}

}
