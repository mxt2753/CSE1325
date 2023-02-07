/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P03 Multichoice Question
TODO: see program comments below
*/
public class Quizzer 
{
    public static void main(String[] args) 
    {
        try 
        {
            //Need to instance the quix from the other program
            Quiz quiz=new Quiz();
            //the quiz/score/grade is in a double.
            double Grade=quiz.takeQuiz();
            
            System.out.println("Your Grade is "+(Grade*100));
            
        } 
        catch (IllegalArgumentException Err) //err for error
        {
            System.err.println("Getting error now exiting this program" + Err.getMessage());
            
            System.exit(1); //I'm pretty sure since I'm not in Donna French's class I can do that.
        }
    }
}
