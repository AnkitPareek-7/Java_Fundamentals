//Parent constructor always executes before child constructor.

class Animal {
    String name= "Animal";
    Animal(){
        System.out.println("Parent Constructor");
    }
}


class Dog extends Animal {
    String name ="Dog";
    Dog(){
        System.out.println("Child Constructor");
    }

    void display(){
        System.out.println(super.name);
        System.out.println(name);
    }
}


public class InheritanceExample {

    public static void main(String[] args){

        Dog dozo = new Dog();
        dozo.display();
    }
}

/*
Output:
Parent Constructor
Child Constructor
Animal
Dog
*/

