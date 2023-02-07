/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P03 Multichoice Question
TODO: see program comments below
*/
//since the TA said to not do unused imports im gonna just do this one because it's the only one they want.
import java.util.ArrayList;

public class Quiz 
{
    //Public Quiz() let's connect it to the loadQuiz() on the bottom
    public Quiz() 
    {
        loadQuiz();
    }
    //take quix()
    public double takeQuiz() 
    {
        //initialize the numbero f correct answers or NOQC (for forgot to leter is properlly but you still get it)
        int NOQC=0;
        //from Questions question section
        //for the string of question
        for(Question question:questions) 
        {
            System.out.println(question);
            //need to show the user what they typed
            System.out.print("Your answer? ");
            //PA = proposed answer 
            //int PA = new Scanner(System.in).nextInt();
            int PA= Integer.parseInt(System.console().readLine());
            //make correct answer ++
            if(question.checkAnswer(PA)) 
            {
                NOQC++;
            }
        }
        //return the double int of correct Answer/ question size
        return(double)NOQC/questions.length;
    }
    private void loadQuiz() 
    {
        //since this is multiple questions I'm gonna intiate a new array list with questions.
        questions = new Question[] 
        {
            //1st question
            new Question("What is the best selling video game?", new String[] 
            {
            "The Last Of Us", "MineCraft", "Metroid", "Spore"
            }, 2),
            //2nd question
            new Question("What is Riot entertainment known for?", new String[] 
            {"World of warcraft", "Mario", "League of Legends", "Zelda"
            }, 3)
        };
    }
    private Question[] questions;
    //Questions have to be private
    //private ArrayList<Question> questions;thought it would have to be this
    //Public Quiz() let's connect it to the loadQuiz() on the bottom
}
