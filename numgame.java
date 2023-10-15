import java.util.*;
import java.util.Scanner;

class numgame
{
    public static void game()
    {
        int rd;
        int gn;
        int c;
        rd=(int)(Math.random()*100)+1;
        c=0;
        System.out.println("Enter your Number:");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            gn=sc.nextInt();
            c++;
            if(gn==rd)
            {
                System.out.println("You have guessed it correct .. Congratulations"+"\n"+rd+"is my number");
                break;
            }
            if(c==5)
            {
                System.out.println("Attempts are completed "+"\n"+"You Lose.. Random number is"+rd);
                break;
            } 
            if(gn<rd)
            {
                System.out.println("Number is too low.. Try again");
                
            }
            else if(gn>rd)
            {
                System.out.println("Number is too high.. Try again");
            }
            
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        System.out.println("Let's play a game. Random number will be pick between 1 and 100 ");
        Scanner sc1 = new Scanner(System.in); 
        boolean playAgain;
        do {
              game();  // call subroutine to play one game
              System.out.println("Would you like to play again?true/false");
              playAgain = sc1.nextBoolean();  
              } while (playAgain);
          System.out.println("Thanks for playing...");
    }
}