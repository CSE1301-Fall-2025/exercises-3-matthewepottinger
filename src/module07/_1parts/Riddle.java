package module07._1parts;

public class Riddle
{
   // variable initialization
   private String Question;
   private String Answer;   
   
   // object constructor
   public Riddle(String initQuestion, String initAnswer)
   {
      Question = initQuestion;
      Answer = initAnswer;
   }
   
   // Print riddle question
   public void printQuestion()
   {
     System.out.println(Question);
   }
   
   // Print riddle answer
   public void printAnswer()
   {
     System.out.println(Answer);
   }
   
   // main method for testing
   public static void main(String[] args)
   {
      // call the constructor to create new Riddle object
      Riddle Q1 = new Riddle("I have no hinge, latch nor lid, yet inside golden treasure's hid. What am I?", "An Egg!");
      // call Q1's print method
       Q1.printQuestion();
       Q1.printAnswer();
   }
}
