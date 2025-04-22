import java.util.Scanner;
public class bank {
    public static void main (String[] arg){

    // creating objects
        Scanner input = new Scanner(System.in);
        Acccount mohamed = new Acccount(1000) ;

    // variable 
    double balance ;
    double monye ;
    int main = 0 ;

    // user input 
    do{
    System.out.println("**********************");
    System.out.println("BANKING PROGRAM ");
    System.out.println("**********************");
    System.out.println("1) Show balance ");
    System.out.println("2) deposit ");
    System.out.println("3) withdrow ");
    System.out.println("4) EXIT ");
    System.out.println("**********************");
    System.out.print("Enter ur choise (1-4): ");
    main = input.nextInt();
    System.out.println("\n");

    switch (main) {
        case 1:
            System.out.println("your account balance is: " + mohamed.GetBalance() );
            break;
        case 2 :
            System.out.print("Enter the amount of monye u whant to deposit: ");
            monye = input.nextFloat();
            mohamed.Deposit(monye);
            break;
        case 3 :
            System.out.print("Enter the amount of monye u whant to withdrow: ");
            monye = input.nextFloat();
            mohamed.Widthrow(monye);
            break;
        case 4 :
            System.out.println("BYE");
            break;
        default:
            System.out.println("ENVALID INOUT TRY AGAIN");
            break;
        
    }
        System.out.println("\n");
    }while(main != 4);



        input.close();
    }
}