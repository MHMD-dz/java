package second_oop.Main_java;
import java.util.Scanner;
import second_oop.packeges.Prodect;

public class Main {
    public static void main(String[] args){
        // craet object
        Scanner scan = new Scanner(System.in);
        Prodect phone = new Prodect("samsenge","not 20 ultra",1000.5,5,10.0) ;

        // variable
        phone.display();

        scan.close();
    }
}
