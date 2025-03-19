package therd_oop;
import java.util.Objects;

public class Student {
    // variable 
    private String name ;
    private String univ ;
    private static String fild = "info" ;
    private int number ;
    private static int cont = 1 ;
    private String pass ;

    // constracter
    public Student( String namec , String passc){
        this.number = cont ;
        this.name = namec ;
        this.pass = passc ;
        cont++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniv() {
        return this.univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student univ(String univ) {
        setUniv(univ);
        return this;
    }

    public Student number(int number) {
        setNumber(number);
        return this;
    }

    public Student pass(String pass) {
        setPass(pass);
        return this;
    }


    // function 
    public boolean isLogIn( int numb , String pas ){
        if (this.number == numb && this.pass.equals(pas)) {
            return true ;
        }
        return false ;
    }

    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", univ='" + getUniv() + "'" +
            ", number='" + getNumber() + "'" +
            ", pass='" + getPass() + "'" +
            "}";
    }
}
