/*  
 One thing behaving in many different forms.
 The same method name can perform different tasks depending on the object or parameters

Polymorphism
     |
     +----------------------+
     |                      |
Compile-Time          Run-Time
(Method Overloading)  (Method Overriding)

Compile-Time Polymorphism (Method Overloading)
This is decided by the compiler.
It happens when multiple methods have the same name but different parameters.


*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 4.5));
    }
}

