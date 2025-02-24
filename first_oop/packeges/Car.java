package first_oop.packeges;

public class Car {

    // variables
    public String name ;
    public int speed ;
    public float price ;
    public int model ;

    // function 

    // set
    public void set_name( String n ){
        name = n ;
    }
    public void set_speed( int s ){
        speed = s ;
    }
    public void set_price(float p ){
        price = p ;
    }
    public void set_model( int  m ){
        model = m ;
    }

    // get
    public String get_name(){
        return name ;
    }
    public int get_speed(){
        return speed ;
    }
    public float get_price(){
        return price ;
    }
    public int get_model(){
        return model ;
    }
}
