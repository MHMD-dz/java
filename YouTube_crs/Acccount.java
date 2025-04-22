public class Acccount {
    
    // variables
    private double AccBalance ;

    // methode 
    public void SetBalance(double balanc){
        this.AccBalance = balanc ;
    }
    public double GetBalance(){
        return this.AccBalance ;
    }
    public void Deposit(double depo){
        if (depo <= 0) {
            System.out.println("ERROR INVALID NUMBER TRY AGAIN");
        }
        else{
            this.AccBalance += depo ;
            System.out.println("the monye hase been deposit in ur account secsesfuly!");
        }
    }
    public void Widthrow(double wid){
        if (wid <= 0 || wid > this.AccBalance) {
            System.out.println("ERROR INVALID NUMBER TRY AGAIN");
        }
        else{
            this.AccBalance -= wid ;
            System.out.println("the monye hase been withdrow from ur account secsesfuly!");
        }
    }

    // constructor
    Acccount (double hi){
        this.AccBalance = hi ;
    }
}
