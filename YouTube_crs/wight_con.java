import java.util.Scanner;

public class wight_con {
    public static void main (String[] arge){
        Scanner scaner = new Scanner(System.in);

        // declaring variables
        float kgs , lps  ;
        int unit ;

        // demanding usre choise 
        System.out.println(" THIS PROGRAM CONVER BETWINE KGSR AND LPS ");
        System.out.println("---------------------------------------------");
        System.out.print("Enter the unit of Weight: [if kgs enter (1) or (2) for lps] :  ");
        unit = scaner.nextInt();

        if (unit == 1) {
            System.out.print("enter the weight in kgs: ");
            kgs = scaner.nextFloat();
            System.out.printf("%f lps in kgs is %.2f kgs" , kgs  , kgs * 2.20462  );
        }
        else if (unit == 2) {
            System.out.print("enter the weight in lps: ");
            lps = scaner.nextFloat();
            System.out.printf("%f lps in kgs is %.2f kgs" , lps  , lps / 2.20462  );
        }
        else {
            System.out.println("ERROR you have enterd unvalid valeu !");
        }

        scaner.close();
    }
}
