import java.util.Scanner;
public class math {
    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("the pi number is: "+ Math.PI);
        System.out.println("the EUler number is: "+ Math.E);

        // some math function 
        float result ;

        result = (float) Math.pow(5 , 2) ;
        result = Math.abs(-100);
        result = (float) Math.sqrt(result) ;
        result = Math.round(3.15) ;
        result = Math.round(3.85) ;
        result = (float) Math.ceil(3.15) ;
        result = (float) Math.floor(3.95) ;
        result = Math.min(100, 20 ) ;
        result = Math.max(100, 20 ) ;

        System.out.println(result);

        // HYPOTENUSE of an right angeld triangle
        float a , b , c ;
        System.out.print("Enter the valuer of a: ");
        a = scaner.nextFloat();
        System.out.print("Enter the valuer of b: ");
        b = scaner.nextFloat();

        c = (float)Math.sqrt ( (float)Math.pow( a , 2) + (float)Math.pow(b , 2 ));

        System.out.println("the HYPOTENUSE of an right angeld triangle is:  " + c + " cm²");

        scaner.close();

    }
    
}
