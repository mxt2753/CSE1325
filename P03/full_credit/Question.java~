/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P03 Multichoice Question
TODO: see program comments below
*/
public class Question
{
    
    //Public Question
    public Question(String question, String[] answers, int rightAnswer) 
    {
        //Let's initialize all the this. =
        //1 Question string
        this.question = question;
        //2 Answers string[]
        this.answers = answers;
        //rightAnswer int
        this.rightAnswer = rightAnswer;
        //says in intstructions to do questionNumber = nextQuestionNumber++;
        this.questionNumber = nextQuestionNumber++;
        
        if (rightAnswer<1||rightAnswer>answers.length) 
        {
            throw new IllegalArgumentException("Your choices are between 1 & 4. Not outside of it");
        }
    }
    //public boolean checkAnswer

    public boolean checkAnswer(int answer) 
    {
        return answer==rightAnswer;
    }
    //now it's time to override it

    @Override
    //public string overide
    public String toString() 
    {
        //let's do the messt string builder with the appends.
        StringBuilder StringB=new StringBuilder();
        //Learned Append in another class
        //the string of answers
        StringB.append(questionNumber).append(". ").append(question).append("\n");
        //now do a for loop with the appends of the answers
        for(int i=0;i<answers.length;i++) 
        {
            StringB.append(" ").append(i+1).append(") ").append(answers[i]).append("\n");
        }
        return StringB.toString();
    }
    //Let's get the privies out of the way to get it done and over with
    private static int nextQuestionNumber = 1;
    private final int questionNumber;
    //I'm gonna make this a final int because it sounds like a  const
    private int rightAnswer;
    private String question;
    private String[] answers;
}
