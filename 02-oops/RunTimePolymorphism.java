/*
Runtime Polymorphism (Method Overriding)

This is the most important type.

It happens using:

Inheritance
Method overriding

The method is selected while the program is running, not during compilation.

During Inheritance : A child class provides its own implementation of a method already defined in the parent class.
*/


class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks !!");
    }
}
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows !");
    }

}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();   //Animal makes sound
        d.sound();   // Dog Barks !!
        c.sound();   // Cat Meow !

    }
}
