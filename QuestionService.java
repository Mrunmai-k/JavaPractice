import java.util.Scanner;

public class QuestionService {
    Question questions[] = new Question[5];
    String selections[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is your name?", "Mrunmai", "Bhagya", "Dipti", "Momo", "Mrunmai");
        questions[1] = new Question(2, "Favorite Language?", "Java", "Python", "Cpp", "C", "Java");
        questions[2] = new Question(3, "Favorite Color?", "Red", "Blue", "Green", "Black", "Black");
        questions[3] = new Question(4, "Favorite Game", "Football", "Cricket", "Hockey", "Chess", "Football");
        questions[4] = new Question(5, "Favorite Country?", "India", "Russia", "Germany", "Korea", "India");

    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the answer:");
            selections[i++] = sc.nextLine();
            // sc.close();
        }
        // for (String s : selections) {
        //     System.out.println(s);
        // }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualans = que.getAnswer();
            String userans = selections[i];

            // compare ans and selections of user
            if(actualans.equals(userans))
                score++;
        }
        System.out.println("Your score is: "+score);
    }
}
