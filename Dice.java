import java.util.Scanner;
import java.lang.Math;

public class Dice
{
    public static void main(String[] args)
    {
        String answer = "Yes";
        while (answer.equals("Yes")){
        
        Scanner kin = new Scanner(System.in);
        
        int dice2 = (int)(Math.random() * 6) + 1;
        int dice1 = (int)(Math.random() * 6) + 1;
        
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        int x = dice1 + dice2;
        System.out.println("The sume of the two dice is: " + x);
        
        System.out.println("Would you like to play again? Please answer Yes or No. Capitals do matter.");
        
         answer = kin.next();
         
         if (answer.equals("No")){
             System.out.println("Goodbye");
            }
    }


    
    
        
    }
}