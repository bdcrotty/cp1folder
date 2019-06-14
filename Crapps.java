import java.lang.Math;// Ben Crotty Josh Parsio
import java.util.Scanner;

public class Crapps
{
    public static void main(String[] args)
    {
      Scanner kin = new Scanner(System.in);
      String answer = "Yes";
      while (answer.equals("Yes")){
        System.out.println("You are going to roll a dice.");
        int dice2 = (int)(Math.random() * 6) + 1;
        int dice1 = (int)(Math.random() * 6) + 1;
      
        int p = 0;
        int r1 = dice1 + dice2;
        System.out.println("First Roll: " + r1);
        if(r1 == 7 || r1==11)
        {
            System.out.println("You win!");
       }
        else if (r1 == 2 || r1 == 3 || r1 == 12)
        {
          System.out.println("You lose");
        }
        else 
        {
          p = r1;
        }
        int r2 = 0;
				int score = 1;
        while (p != r2)
        {
          dice2 = (int)(Math.random() * 6) + 1;
          dice1 = (int)(Math.random() * 6) + 1;
          r2 = dice1 + dice2;
					System.out.println("Rolling again: " + r2);
					score = score + 1;
					if (r2 == p)
					{
						System.out.println("You win. \nScore: " + score);
            System.out.println("Play again? (Yes/No)");
            answer = kin.next();
					}
					if (r2 == 7)
          {
            System.out.println("You lose.");
            r2 = p;
          	System.out.println("Play again? (Yes/No)");
          	answer = kin.next();
          }
      }
    }  
  }
}
