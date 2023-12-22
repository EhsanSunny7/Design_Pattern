package GOF.Lab12.interpreter;

public class InterpreterPatternDemo {

   // Rule: Robert and John are male
   public static Expression getMaleExpression() {
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);
   }

   public static Expression getMarriedWomanExpression() {
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
   }

   public static Expression getSonExpression() {
      Expression stuart = new TerminalExpression("Stuart");
      Expression robert = new TerminalExpression("Robert");
      return new SonExpression(stuart, robert);
   }

   public static Expression getDaughterExpression() {
      Expression samantha = new TerminalExpression("Samantha");
      Expression julie = new TerminalExpression("Julie");
      return new DaughterExpression(samantha, julie);
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSonExpression = getSonExpression();
      Expression isDaughterExpression = getDaughterExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is son of Robert?" + isSonExpression.interpret("Stuart is son of Robert"));
      System.out.println(
            "Samantha is Daugther of Julie? " + isDaughterExpression.interpret("Samantha is Daugther of Julie"));
   }
}