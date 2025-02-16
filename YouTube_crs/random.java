import java.util.Scanner ;
import java.util.Random ;
public class random {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random() ;
        int hi , from , to ;
        float hii ;

        System.out.print("what do you want from your random number to start:  ");
        from = scanner.nextInt() ;
        System.out.print("and where you want it to end:  ");
        to = scanner.nextInt();
        hi = random.nextInt(from,to) ;
        hii = random.nextFloat(from,to) ;
        System.out.println("your random nember is: " + hi);
        System.out.println("your float random nember is: " + hii);


        scanner.close();
    }
}
