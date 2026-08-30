package QuizApp;

public class Question {
    private String id;
    private String question;
    private String options[];
    private String ans;
    
    public Question(String id, String question, String op1, String op2, String op3, String op4, String ans) {
        this.id = id;
        this.question = question;
        this.options = new String[4];
        this.options[0] = op1;
        this.options[1] = op2;
        this.options[2] = op3;
        this.options[3] = op4;
        this.ans = ans;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", op1=" + options[0] + ", op2=" + options[1] + ", op3=" + options[2]
                + ", op4=" + options[3] + ", ans=" + ans + "]";
    }
    
} 
