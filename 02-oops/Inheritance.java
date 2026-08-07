class vehicle{
    String Brand;
    String modelName;

    void start(){
        System.out.println("vroommmm... *Engine Starts* ");
    }

    void vehicleDetail(){
        System.out.println("Brand : "+Brand+" , Model : "+modelName);
    }
}
class car extends vehicle {}
class bike extends vehicle {} 

public class Inheritance {
    public static void main(String[] args) {
        
    car virtus = new car();      //menifesting : own a Volkswagon Virtus in 2028
    bike hunter350 = new bike();    //menifesting : to own a Hunter 350 before 2028

    hunter350.Brand = "RoyalEnfield";
    hunter350.modelName = "Hunter 350";
    
    virtus.Brand = "Volkswagon";
    virtus.modelName = "Virtus";

    hunter350.vehicleDetail();
    hunter350.start();
    virtus.vehicleDetail();
    virtus.start();

    }
}
