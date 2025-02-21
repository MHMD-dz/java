import java.util.Scanner;
public class str_met {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);


        String name = "Benzineb Mohamed" ;
        int lenght ;
        lenght = name.length() ;
        char letter ;
        letter = name.charAt(9) ;
        System.out.println("the lenght of " + name + " is: " + lenght);
        System.out.println("the 9 leter from the name is: " + letter);
        // letter plase 
        int index = name.indexOf("M");
        System.out.println("the index of letter M in name is: "+index);
        // upper case 
        name = name.toUpperCase() ;
        System.out.println(name);
        name = name.toLowerCase() ;
        System.out.println(name);
        name = name.replace("o" , "u") ;
        System.out.println(name);
        
        scanner.close();

    }
}
