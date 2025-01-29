import java.util.Scanner;
public class QuestionService {

    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] =  new Questions(1,"What is 1+2?","1","2","3","4","3");
        questions[1] =  new Questions(2,"What is 2+2?","1","2","3","4","4");
        questions[2] =  new Questions(3,"What is 3+2?","5","2","3","4","5");
        questions[3] =  new Questions(4,"What is 4+2?","1","2","6","4","6");
        questions[4] =  new Questions(5,"What is 5+2?","1","2","3","7","7");

    }

    public void playQuiz(){
        int score = 0;
        for(Questions q:questions){
            System.out.println("Question Id: "+ q.getId());
            System.out.println("Question: "+ q.getQuestion());
            System.out.println("Option 1: "+ q.getOpt1());
            System.out.println("Option 2: "+ q.getOpt2());
            System.out.println("Option 3: "+ q.getOpt3());
            System.out.println("Option 4: "+ q.getOpt4());

            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();

            if(ans.equals(q.getAnswer())){
                System.out.println("Correct Answer");
                score++;
            }
            else{
                System.out.println("Wrong Answer");
                score--;
            }

            sc.close();
        }
    }
}
