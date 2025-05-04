public class callRef {

    static void addition(int number){
                number += 10;
            }
    static void addition(Test number){
        number.number += 10;
    }
       
    public static void main (String[] arg){
        Test t = new Test();
        t.number = 5;
        int number = 5  ;
        callRef.addition(number);
        callRef.addition(t);
        System.out.println("number = " + t.number);
        
}}