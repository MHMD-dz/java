import java.util.Scanner;

public class problem2 {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner(System.in) ;
        String product ;
        float price , total_price ;
        int quantiti ;

        System.out.print("Enter the product that  you want to buy:  ");
        product = scanner.nextLine();

        System.out.print("how mutch is the price of the " + product + ":  ");
        price = scanner.nextFloat();

        System.out.print("how much " + product + " you want to buy:  ");
        quantiti = scanner.nextInt() ;

        System.out.println();
        total_price = quantiti * price ;
        System.out.println("you bougth " + quantiti + " " + product + "\\s");
        System.out.println("you total is "+ total_price + "$");

        scanner.close();
    }
    
}
