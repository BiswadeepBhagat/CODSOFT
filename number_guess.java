import java.util.*;
import java.lang.Math;
public class number_guess {
public static void main(String[] args) {
            
        int ch = 1;
        System.out.println("**************************************************************\n" + "                    GUESS THE NUMBER\n" + "**************************************************************");
                while(ch==1)
                {
                    ch = guessTheNumber();
                }
        }
        public static int guessTheNumber()
        {
            int i = 5;
            int num = (int) (Math.random() * 100) + 1;
            boolean correct = false;
            Scanner in = new Scanner(System.in);
            System.out.println("CPU is thinking of a number between 1 and 100.\nYou get 5 tries to guess the number.");
            while (i > 0) {
                System.out.println("Enter your guess: ");
                int guess = in.nextInt();
                if (guess == num) {
                    System.out.println("You have guessed the number!\nYou win!");
                    correct = true;
                    break;
                } else if (guess > num) {
                    System.out.println("Your guess is too high.\tTries left: " + (i - 1));
                    i--;
                } else {
                    System.out.println("Your guess is too low.\nTries left:" + (i - 1));
                 i--;
                }
            }
            if (correct == false) {
                System.out.println("You ran out of tries.\nThe number was : " + num + "\nYou lose!");
            }
            System.out.println("Do you want to play again? (yes/no): ");
            int ch = in.nextInt();
            return ch;   
        }
    }