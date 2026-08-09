//True Runtime Polymorphism with Examples (important)

 
// Parent Class
class Employee {

    // This method WILL be overridden
    void work() {
        System.out.println("Employee is working.");
    }

    // This method is NOT overridden
    void attendMeeting() {
        System.out.println("Employee is attending a company meeting.");
    }
}

// Child Class
class SoftwareEngineer extends Employee {

    // Method Overriding
    @Override
    void work() {
        System.out.println("Software Engineer is writing Java code.");
    }

    // Child-specific method
    void writeCode() {
        System.out.println("Software Engineer is developing a project.");
    }
}

public class TrueRunTimePolymorphism {

    public static void main(String[] args) {

        
       
        //* Case 1 :  Child Reference -> Child Object
        SoftwareEngineer se = new SoftwareEngineer();       //Compiler looks at referece type, and check which mehods are available to call;
        // and since SoftwareEngineer is Reference there are three method available are availabe or valid to call (work(), attendmeeting(), writeCode())
        // but during run time it is decided which method will execute, since SoftwareEngineer is actual object, if a method is overridden SOftwareEngineer then overridden method will executes
        
        
        se.work();              // Overridden method (from softwareEngineering)
        se.attendMeeting();     // Inherited from Employee
        se.writeCode();         // Child's own method

        /*
         Output:
         Software Engineer is writing Java code.
         Employee is attending a company meeting.
         Software Engineer is developing a project.
        */


        
        //* Case 2 :  Parent Reference -> Parent Object
        Employee emp = new Employee();

        emp.work();  // Employee's own method
        emp.attendMeeting(); // Employee's own method
        //! emp.writeCode();  // NOT ALLOWED, Compile Error, Because Employee class doesn't have writeCode()
        // Remember child class inherits parent properties, not parent. so Parent class can not use child class

        /*
         Output:
         Employee is working.
         Employee is attending a company meeting.
        */




        //* Case 3 : Parent Reference -> Child Object (UPCASTING)
        Employee emp2 = new SoftwareEngineer();  // Employee is reference, Software Engineering is actual object

        // Compiler checks Employee class
        // Employee has work() and attendMeeting()
        // So both are callable.

        emp2.work();          // Runtime decides -> SoftwareEngineer version
        emp2.attendMeeting(); // Not overridden -> Employee version

        // emp2.writeCode(); //!NOT ALLOWED, Compile Error, Cause Employee do not have writeCode() function (Employee is Reference)
        //! Compiler only sees Employee reference

        /*
         Output:
         Software Engineer is writing Java code.
         Employee is attending a company meeting.
        */


        //* Case 4 : DOWNCASTING

        Employee emp3 = new SoftwareEngineer();  // emp3 is Parent(employee) Referece and Child(SoftwareEngineer) object

        // Downcasting
        SoftwareEngineer se2 = (SoftwareEngineer) emp3;   // we do not use 'new' cause emp3 is already exist
        // se2 is not softwareEngineer refernce cause we dont create new but we copy reference and actual object from exsting emp3
        se2.work();        // cause se2 is software object (child) type, overridden method executes
        se2.attendMeeting();
        se2.writeCode();

        /*
         Output:
         Software Engineer is writing Java code.
         Employee is attending a company meeting.
         Software Engineer is developing a project.
        */


        //* Case 5: Unsafe Downcasting

        Employee emp4 = new Employee();
        //! COMPILER ALLOWS THIS BUT RUNTIME WILL THROW ClassCastException
        // SoftwareEngineer se3 = (SoftwareEngineer) emp4;  //emp4 is Employee Refrence and Object but SOftware object is not present in emp4 so it will not able to give SoftwareEng obejct to se3
        // Runtime Error: java.lang.ClassCastException

        
        //* Case 6 : Illegal Object Creation");
        // SoftwareEngineer se4 = new Employee(); //! NOT ALLOWED, Compile Error : Type mismatch : cannot convert from Employee to SoftwareEngineer
        // Every Software Engineering is Employee but not every Employee is Software Engineer (every method present is Parent can be used by child, but every child method can not be used by parent)
        // if incase this would be allowed, Acc to reference all there method will callable (work(), attendMeeting(), WriteCode()) but during executing object method is executes, can writeCode() execute? No, cause its not present in parent class
        
        //* Case 7 :Safe Downcasting using instanceof

        Employee emp5 = new SoftwareEngineer();

        if (emp5 instanceof SoftwareEngineer) {

            SoftwareEngineer se5 = (SoftwareEngineer) emp5;

            se5.work();
            se5.attendMeeting();
            se5.writeCode();
        }

        /*
         Output:
         Software Engineer is writing Java code.
         Employee is attending a company meeting.
         Software Engineer is developing a project.
        */
    }
}
