package second_oop.Main_java;
import java.util.Scanner;
import second_oop.packeges.Prodect;

public class Main {
    public static void main(String[] args){
        // craet object
        Scanner scan = new Scanner(System.in);
        Prodect phone = new Prodect("samsenge","not 20 ultra",1000.5,5,10.0) ;
        Prodect phone2 = new Prodect(phone) ;

        // variable
        phone2.display();
        

        scan.close();
    }
}
