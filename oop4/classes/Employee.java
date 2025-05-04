package oop4.classes;

public class Employee {

    // variables 
    protected String name ;
    protected String email ;
    protected String phone ;
    protected String address ;
    protected String department ;
    protected int birtheYear ;

    // methode 
    public void affiche() {
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Address : " + address);
        System.out.println("Department : " + department);
        System.out.println("Birth Year : " + birtheYear);
    }
    
    // constructor
    public Employee(String name, String email, String phone, String address, String department, int birtheYear) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.birtheYear = birtheYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public int getBirtheYear() {
        return birtheYear;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBirtheYear(int birtheYear) {
        this.birtheYear = birtheYear;
    }

}
