import java.util.Scanner ;
public class problem1 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;

        float width , hight , area ;
        System.out.print("Enter the widht  : ");
        width = scanner.nextFloat();
        System.out.print("Enter the hight : ");
        hight = scanner.nextFloat();

        area = hight * width ;
        System.out.println("the area is : " + area + " cm²");



        scanner.close();
        
    }
}