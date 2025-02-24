import java.util.Scanner ;
public class switche {
    public static void main (String[] arge){
        Scanner scanner = new Scanner(System.in);
        // calculator programme

        // declaring variabels
        float first_number , second_number ;
        char operation ;

        // user input
        System.out.print("Enter the first number: ");
        first_number = scanner.nextFloat();

        System.out.print("enter the opeatin: [ + , - , * , / ]: ");
        operation = scanner.next().charAt(0) ;

        System.out.print("Enter the second number: ");
        second_number = scanner.nextFloat();

        // operation part

        switch(operation){
            case '+' -> System.out.println(first_number +  " + " + second_number + " = " + first_number + second_number);
            case '-' -> System.out.println(first_number +  " - " + second_number + " = " + (first_number - second_number));
            case '*' -> System.out.println(first_number +  " * " + second_number + " = " + first_number * second_number);
            case '/' -> System.out.println(first_number +  " / " + second_number + " = " + first_number / second_number);
            default -> System.out.println("ERROOOOOOOOOR");
        }


        scanner.close();
    }
}
