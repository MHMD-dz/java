package oop4.main;
import java.util.Scanner;
import oop4.classes.Developer;

public class hi {
    public static void main (String[] args) {
        // creating the object
        Scanner scan = new Scanner(System.in);
        Developer mhmd = new Developer("Mohamed","mhmd@gmail.com","0696969","oran", "IT", 2003, "S4");

        // setting the values

        // output
        mhmd.affiche();
        System.out.println(mhmd.getClass());


    }
    
}
