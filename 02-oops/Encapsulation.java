
/* Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) 
while restricting direct access to the data.
 1. Put variables and methods inside one class.
 2. Hide the variables from outside using private.
 3. Allow controlled access using public methods (getters and setters).
*/

class Employee{
    String empName;
    String jobRole;
    private double Salary; //in LPA

    public void setSalary(double newSalary){
        this.Salary = newSalary;
    }

    public double getSalary(){
        return Salary;
    }

    //if we create a object a defualt constructor will be called and then we manually need to assign variable's value. instead make a constructor

    public Employee(String empName, String jobRole){
        this.empName = empName;
        this.jobRole = jobRole;
    }

    public void displayDetails(){
        System.out.println(" Employee : "+this.empName);
        System.out.println(" Job Postion : "+this.jobRole);
        System.out.println(" Current Salary : "+this.Salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Employee newEmp = new Employee("Ankit Pareek", "SDE 1"); //menifesting la.. la.. la...   (Aug,2026)
        
        newEmp.setSalary(15.0); // previous salry is now over ridden by 15.0 LPA                 // ""
        System.out.println(" -- New Fresher Details --");
        // double newEmpSalary = newEmp.getSalary(); // to read salary, but we dont need this now 
        newEmp.displayDetails(); 
    }
    
}

/*
Output : 

 -- New Fresher Details --
 Employee : Ankit Pareek
 Job Postion : SDE 1
 Current Salary : 15.0

*/