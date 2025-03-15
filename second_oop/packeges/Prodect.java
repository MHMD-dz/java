package second_oop.packeges;

public class Prodect {
    // variables
    private String name ;
    private String discription ;
    private double price ;
    private int quantity ;
    private double discount ;

    // constracters
    // no args constracter
    public Prodect(){
        name = "realme" ;
        discription = "realme 10 " ;
        price = 35000 ;
        quantity = 1 ;
        discount = 0 ;
    }

    // paramitarize constracter
    public Prodect(String nm , String ds , double pr , int qu , double dis){
        name = nm ;
        discription = ds ;
        price = pr ;
        quantity = qu ;
        discount = dis ;
    }

    //Copy Constructor
    public Prodect( Prodect obj){
        name = obj.name ;
        discription = obj.discription ;
        price = obj.price ;
        quantity = obj.quantity ;
        discount = obj.discount ;
    }

    // function 
    // set function
    public void setName(String newn){
        name = newn ;
    }
    public void setDiscription(String newd){
        discription = newd ;
    }
    public void setPrice(double newp){
        price = newp ;
    }
    public void setQuantity(int newq){
        quantity = newq ;
    }
    public void setDiscount(double newd){
        discount = newd ;
    }

    // get function 
    public String getName(){
        return name ;
    }
    public String getDiscription(){
        return discription ;
    }
    public double getPrice(){
        return price ;
    }
    public double getDiscount(){
        return discount ;
    }
    public int getQuantity(){
        return quantity ;
    }

    // display
    public void display(){
        System.out.println( "name of prodect: " + this.getName());
        System.out.println( "discription of prodect: " + this.getDiscription());
        System.out.println( "price of prodect: " + this.getPrice());
        System.out.println( "quantity of prodect: " + this.getQuantity());
        System.out.println( "discounf on the prodect: " + this.getDiscount());

    }
    // paramitarize constracter
}
