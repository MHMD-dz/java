package first_oop.packeges;

public class Accont {
    // variables
    private int accNumber ;
    private String userName ;
    private float amount ;

    // function 

    // set 
    public void incert ( int an , String un , float am){
        accNumber = an ;
        userName = un ;
        amount = am ;
    }

    public void deposi( float monye){
        amount += monye ;
    }

    public void withdrow ( float noo ){
        if ( amount >= noo) {
            amount -= noo ;
        }
        else {
            System.out.println("ERROR : your balance is not enough !");
        }
    }

    public void checkbalance (){
        System.out.println("balance = " + amount);
    }

    public String toString() {
        return "Account : { acount number = " + accNumber + " , user name: " + userName + ", balance = " + amount + "}" ;
    }
}
