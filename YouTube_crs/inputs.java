// inport input func
import java.util.Scanner ;
public class inputs {
    public static void main (String[] args) {
        // idk wth is this 
        Scanner scanner = new Scanner(System.in) ;
        // declaring the variables
        String first_name , last_name , car_name ;
        int age , salary;
        System.out.println("Enter your first name : ");
        first_name = scanner.nextLine();
        System.out.println("Enter your last name : ");
        last_name = scanner.nextLine();
        System.out.println("Enter your age : ");
        //age = scanner.nextLine();
        System.out.println("Enter your dream car name : ");
        car_name = scanner.nextLine();

        System.out.println("Hallo " + last_name + " " + first_name);



        scanner.close();
    }
}
