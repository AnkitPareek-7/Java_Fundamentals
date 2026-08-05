class Laptop {

    String brand;
    String model;
    int ram;
    int storage;
    double price;

    Laptop(String brand) {
        this.brand = brand;
        System.out.println("Brand initialized");
    }

    Laptop(String brand, String model) {
        this(brand);
        this.model = model;
        System.out.println("Model initialized");
    }

    Laptop(String brand, String model, int ram) {
        this(brand, model);
        this.ram = ram;
        System.out.println("RAM initialized");
    }

    Laptop(String brand, String model, int ram, int storage, double price) {
        this(brand, model, ram);
        this.storage = storage;
        this.price = price;
        System.out.println("Storage and Price initialized");
    }

    void display() {
        System.out.println("----------------------");
        System.out.println("Brand   : " + brand);
        System.out.println("Model   : " + model);
        System.out.println("RAM     : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("Price   : " + price);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        Laptop laptop =
            new Laptop("ASUS", "ROG Strix", 16, 512, 89999);

        laptop.display();
    }
}

/*
Output : 
Brand initialized
Model initialized
RAM initialized
Storage and Price initialized
----------------------
Brand   : ASUS
Model   : ROG Strix
RAM     : 16 GB
Storage : 512 GB
Price   : 89999.0
*/

/*
the constructor calls happen like this:

5-parameter constructor
          │
          ▼
3-parameter constructor
          │
          ▼
2-parameter constructor
          │
          ▼
1-parameter constructor

Now Java starts returning back like:

1-parameter constructor finishes
        ▲
        │
2-parameter constructor continues
        ▲
        │
3-parameter constructor continues
        ▲
        │
5-parameter constructor continues
*/