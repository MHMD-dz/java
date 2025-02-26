package first_oop.Main;

import java.util.Scanner;

import first_oop.packeges.Accont;

public class Main3 {
    public static void main (String[] arge){
        // creating the object
        Accont baridi = new Accont() ;
        Scanner scan = new Scanner(System.in);

        // variables 
        int acNumber ;
        float monye ;
        String name ;

        // user input 1
        System.out.print("Enter the account number: ");
        acNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the account user name: ");
        name = scan.nextLine();
        System.out.print("Enter the account balance: ");
        monye = scan.nextFloat();

        // set to object 
        baridi.incert(acNumber,name,monye) ;
        baridi.checkbalance();
        // user input 
        System.out.print("How much mony you want to diposit: ");
        baridi.deposi(scan.nextFloat());
        baridi.checkbalance();
        System.out.print("How much mony you want to withdrow: ");
        baridi.withdrow(scan.nextFloat());
        baridi.checkbalance();
        System.out.println(baridi.toString());


        scan.close();
}
}
