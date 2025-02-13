// inport input func
import java.util.Scanner ;
public class inputs {
    public static void main (String[] args) {
        // idk wth is this 
        Scanner scanner = new Scanner(System.in) ;
        // declaring the variables
        String first_name , last_name , car_name ;
        int age , salary;
        float gpa ;
        boolean loser ;
        System.out.print("Enter your first name : ");
        first_name = scanner.nextLine();
        System.out.print("Enter your last name : ");
        last_name = scanner.nextLine();
        System.out.print("Enter your age : ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your dream car name : ");
        car_name = scanner.nextLine();
        System.out.print("Enter your salary : ");
        salary = scanner.nextInt();
        System.out.print("what is your gpa : ");
        gpa = scanner.nextFloat();
        System.out.println("are you a loser : (true/false)");
        loser = scanner.nextBoolean();
        System.out.println();

        System.out.println("Hallo " + last_name + " " + first_name);
        System.out.println("I hope you get your " + car_name + " in the futur");
        System.out.println("and it's not bad salary as " + salary + " DA for semoan in his " + age);
        System.out.println("and your gpa is : " + gpa);
        System.out.println("you are a loser : " + loser);



        scanner.close();
    }
}
