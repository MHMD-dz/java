import java.util.Scanner;
public class substring {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        String email , user_name , domain ;
        int index ;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            index = email.indexOf("@") ;
            user_name = email.substring(0 , index) ;
            domain = email.substring(index+1) ;
            System.out.println();
            System.out.println("your email is: " + email);
            System.out.println("your user name of the email is: " + user_name);
            System.out.println("the domain of your email is: "+domain);
        }
        else {
            System.out.println("the email must contain @ letter !!");
        }


        scanner.close();
    }
}
