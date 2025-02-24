import java.util.Scanner;

public class short_if {
    public static void main (String[] arge){
        Scanner scanner = new Scanner(System.in);

        // declaring the variable
        String ifpass ;
        float avereg ;

        // filing the variables 
        System.out.print("Enter your averege:  ");
        avereg = scanner.nextFloat();

        // the operation

        ifpass  = ( avereg >= 10 ) ? "pass" : "faile" ;

        // the output
        System.out.println(ifpass);


        // little project 
        // variables 
        char hi ;
        float result ;
        float heat ;

        // input
        System.out.print("What unit you want : if Celsius enter (C) or Fahrenheit enter (F): ");
        hi = scanner.next().charAt(0);
        System.out.print("enter how much hot it is on there: ");
        heat = scanner.nextFloat() ;

        // operation 
        result = ( hi == 'c' || hi == 'C') ? (heat * (9f / 5 ) + 32) : ((heat - 32 ) * ( 5f / 9 )) ;

        hi = ( hi == 'c' || hi == 'C') ? 'F' : 'C' ;
        System.out.printf("the heat is %.2f %c: ", result,hi );

        scanner.close();
    }
}
