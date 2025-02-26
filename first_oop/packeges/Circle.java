package first_oop.packeges;

public class Circle {
    // variables 
    private float radius ;
    private String color ;

    // function

    // set
    public void set_Radius(float rad){
        radius = rad ;
    }

    public void set_Color(String col){
        color = col ;
    }

    // get 
    public float get_Radius(){
        return radius ;
    }

    public String get_Color(){
        return color ;
    }

    public double get_Area(){
        return ( Math.PI * (Math.pow(radius, 2)) ) ;
    }

    public double get_Circumference(){
        return ( 2 * Math.PI * radius ) ;
    }

    public String toString() {
        return "Circle : { radius = " + radius + " , color = " + color + " }" ;
    }
    
}
