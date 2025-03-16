import java.util.Random;
import java.util.Scanner;

public class geuss_game {
    public static void main(String[] arg){
        // creating object
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // variable 
        int number ;
        int geuss ;
        int attempt = 0 ;
        boolean isrigth = false ;

        geuss = rand.nextInt(1,101) ;

        // the game
        do {
            attempt++;
            System.out.print("ENTER A NUMBER BETWIN 1/100:  "); 
            number = scan.nextInt();
            if (number == geuss) {
                System.out.println("nice you get it the number is: " + geuss);
                isrigth = true ;
            }else if (number < geuss) {
                System.out.println("to little try again you stil have " + (10 - attempt) + " attempt" );
            }else if (number > geuss) {
                System.out.println("to big try again you stil have " + (10 - attempt) + " attempt" );
            }

            
        } while (attempt < 10 && !isrigth);

        if (!isrigth) {
            System.out.println("you lose the attempt has ended");

        }

        scan.close();
    }
}
