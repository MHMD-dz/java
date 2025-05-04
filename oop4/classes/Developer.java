package oop4.classes;

public class Developer extends Employee {

    //variables
    private String projectName ;

    // method
    public void affiche() {
        super.affiche();
        System.out.println("Project Name : " + projectName);
    }

    // setter 
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    // getters
    public String getprojectName(){
        return projectName;
    }

    // constractor 
    public Developer(String name, String email, String phone, String address, String department, int birtheYear, String projectName) {
        super(name, email, phone, address, department, birtheYear);
        this.projectName = projectName;
    }
}
