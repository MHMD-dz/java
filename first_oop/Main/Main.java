package first_oop.Main;
import first_oop.packeges.Car ;
import java.util.Scanner;

public class Main {
    public static void main(String[] arge){

        // creatin new object 
        Scanner scan = new Scanner(System.in);
        Car dreamCar = new Car() ;
        Car car1 = new Car() ;
        Car car2 = new Car() ;

        // filling the object
        car1.name = "tesla" ;
        car1.speed = 2000 ;
        car1.price = 10 ;
        car1.model = 2100 ;
        System.out.println("the car name is:  "+car1.name);
        System.out.println("the car speed is: "+car1.speed);
        System.out.println("the car price is: "+car1.price);
        System.out.println("the car model is: "+car1.model);
        System.out.println("----------------------------------------------");

        // filling the object using my function
        car2.set_name("KIA") ;
        car2.set_speed(250) ;
        car2.set_price(125.5f) ;
        car2.set_model(2018) ;
        //the output of my masterpice
        System.out.println("the car name is:  "+car2.get_name());
        System.out.println("the car speed is: "+car2.get_speed());
        System.out.println("the car price is: "+car2.get_price());
        System.out.println("the car model is: "+car2.get_model());
        System.out.println("----------------------------------------------");

        // user input
        System.out.print("Enter the car name: ");
        dreamCar.name =  scan.nextLine() ;
        System.out.print("Enter the car speed: ");
        dreamCar.speed =  scan.nextInt() ;
        System.out.print("Enter the car price: ");
        dreamCar.price =  scan.nextFloat() ;
        System.out.print("Enter the car model: ");
        dreamCar.model =  scan.nextInt() ;
        System.out.println("----------------------------------------------");

        // user output
        System.out.println("the dream car name is:  "+dreamCar.name);
        System.out.println("the dream car speed is: "+dreamCar.speed);
        System.out.println("the dream car price is: "+dreamCar.price);
        System.out.println("the dream car model is: "+dreamCar.model);

        scan.close();
    }
}
