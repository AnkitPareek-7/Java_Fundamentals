
class vehicle{
    String brand;
    String model;
    int mYear;
    String color;

    public vehicle(String b, String m, int y, String c) {
        this.brand = b;
        this.model = m;
        this.mYear = y;
        this.color = c;
    }

    public void displayVehicle(){
        System.out.println("This is a "+this.color+" Color "+this.brand+" "+this.model+" "+mYear+" Model.");
    }
    

    class car{
        public void crimeReport(){
            System.out.println("The car is caught overspeeding and drifting at public roads.");
        }

        public void displayCar(){
            vehicle.this.displayVehicle();  
            // we can also write display() directly, 
            // for that compiler first look for the function in inner class then in outer class. 
            
        }

        public void scene(){
            System.out.println("");
            System.out.println(" 'A Reporter while pointing his finger towards a "+vehicle.this.color+" Color Car' says ");
            crimeReport();
            displayVehicle();  // told you nah we can use method of outer name directly to call a method a method in inner class, but if inner class and outer has same name of method
            // then it is adviced to use outerclass.this.method();
        }

    }

    class bike{
        public void crimeReport(){
            System.out.println("The Bike is caught overspeeding and doing stunt at public area.");
        }

        public void displayBike(){
            vehicle.this.displayVehicle();
        }

        public void scene(){
            System.out.println("");
            System.out.println(" A Reporter mentions a "+vehicle.this.color+" Color Bike as");
            crimeReport();
            displayVehicle();
    }

    // An inner class can access both variables and methods of the outer class. But it does not inherit them as its own members.
    }
}


public class InnerClass{
    public static void main(String[] args) {
        

        //OuterClass OuterObjName = new OuterClass();
        //OuterClass.InnerClass InnerObjName = OuterObjName.new InnerClass();

        vehicle v1 = new vehicle("BMW", "M5", 2021, "Blue");
        vehicle.car bmw = v1.new car();
        
        vehicle v2 = new vehicle("Harley Davidson", "Forty Eight", 2024, "Black");
        vehicle.bike hd = v2.new bike();

        //Car and Bike are non-static inner classes of Vehicle, they can directly access the outer class's instance variables. 

        bmw.displayCar();  // we can also use v1.displayVehicle as it defined in outer class
        bmw.crimeReport();

        hd.displayBike();    // we can also use v2.displayVehicle as this method is member of vehicle class.
        hd.crimeReport();

        System.out.println("");
        System.out.println("Other Way");

        bmw.scene();
        hd.scene();

    }
}

/*
Output : 
This is a Blue Color BMW M5 2021 Model.
The car is caught overspeeding and drifting at public roads.
This is a Black Color Harley Davidson Forty Eight 2024 Model.
The Bike is caught overspeeding and doing stunt at public area.

Other Way

 'A Reporter while pointing his finger towards a Blue Color Car' says 
The car is caught overspeeding and drifting at public roads.
This is a Blue Color BMW M5 2021 Model.

 A Reporter mentions a Black Color Bike as
The Bike is caught overspeeding and doing stunt at public area.
This is a Black Color Harley Davidson Forty Eight 2024 Model.
*/