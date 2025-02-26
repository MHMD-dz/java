package first_oop.Main;
import first_oop.packeges.Circle;
import java.util.Scanner;

public class Main2 {
    public static void main (String[] arge){
        // creating the object
        Circle test = new Circle() ;
        Scanner scan = new Scanner(System.in);

        // variables 
        float radius ;
        String color ;  

        // user input
        System.out.print("Enter the circle radius: ");
        radius = scan.nextFloat(); 
        scan.nextLine();
        System.out.print("Enter the circle color: ");
        color = scan.nextLine(); 
        
        // seting
        test.set_Radius(radius);
        test.set_Color(color);

        // output 
        System.out.println("The cicle radius is: " + test.get_Radius());
        System.out.println("The cicle color is: " + test.get_Color());
        System.out.printf("The cicle aria is: %.2f\n" , test.get_Area());
        System.out.printf("The cicle circumference is: %.2f\n" , test.get_Circumference());
        System.out.println(test.toString());


        scan.close();
    }
    
}
