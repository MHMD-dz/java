package therd_oop;
import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        // declaring the object
        Student etd1 = new Student( "mohamed" , "1234") ;
        Student etd2 = new Student( "fekir" , "6548") ;
        Student etd3 = new Student( "amine" , "9876") ;
        Student etd4 = new Student( "laila" , "2525") ;
        Scanner scan = new Scanner(System.in) ;

        // variable
        int number ;
        String  password ;

        // input
        System.out.print("Enter the student number: ");
        number = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the student password: ");
        password = scan.nextLine();

        // output
        System.out.println(etd2.getNumber());
        System.out.println("is the student loged in: " + etd1.isLogIn(number, password));
        



        scan.close();
    }
}
