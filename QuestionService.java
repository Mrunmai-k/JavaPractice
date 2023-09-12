public class QuestionService 
{
    Question questions[] =new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is your name?", "Mrunmai", "Bhagya", "Dipti", "Momo", "Mrunmai");
        questions[1] = new Question(2, "Favorite Language?", "Java", "Python", "Cpp", "C", "Java");
        questions[2] = new Question(3, "Favorite Color?", "Red", "Blue", "Green", "Black", "Black");
        questions[3] = new Question(4, "Favorite Game", "Football", "Cricket", "Hockey", "Chess", "Football");
        questions[4] = new Question(5, "Favorite Country?", "India", "Russia", "Germany", "Korea", "India");

    }

    public void displayQuestions()
    {
        for (Question question : questions) {
            System.out.println(question);
        }    
    }
}
