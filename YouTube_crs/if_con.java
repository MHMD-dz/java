import java.util.Scanner ;
public class if_con {
    public static void main ( String[]  args){
            Scanner scanner = new Scanner(System.in);

            int age ;
            String name ;
            boolean isStudent ;

            System.out.print("Enter your name:  ");
            name = scanner.nextLine() ;
            System.out.print("Are you an student (true\\false):  ");
            isStudent = scanner.nextBoolean() ;
            System.out.print("Enter your age:  ");
            age = scanner.nextInt() ;
            System.out.println("\n\n\n");
            // group 1 
            if (name.isEmpty()) {
                System.out.println("you have'nt enterd your name !!!! ");
            }
            else {
                System.out.println("hello " + name + " !!");
            }

            // group 2
            if (isStudent) {
                System.out.println("You are an student ");
            }
            else {
                System.out.println("you are't student ");
            }

            // group 3
            if (age < 0) {
                System.out.println("You havent bourn yet ");
            }
            else if (age < 3 ) {
                System.out.println("You are baby ");
            }
            else if (age < 13 ) {
                System.out.println("you are chiled ");
            }
            else if (age < 18) {
                System.out.println("you are teneger ");
            }
            else if (age < 65) {
                System.out.println("you are an adult ");
            }
            else {
                System.out.println("you are an grandpa ");
            }

            scanner.close() ;
    }
}
