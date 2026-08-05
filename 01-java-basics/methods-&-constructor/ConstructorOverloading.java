class bike{
    String bikeBrand;
    String modelName;
    int modelYear;
    double mileage;

    
    public bike(String bBrand){
        bikeBrand = bBrand;
        System.out.println("Bike : "+bBrand);
    }

    public bike(String bBrand, String mName){
        bikeBrand = bBrand;
        modelName = mName;
        System.out.println("Bike : "+bBrand+", Model : "+mName);
    }

    public bike(String bBrand, String mName, int mYear){
        bikeBrand = bBrand;
        modelName = mName;
        modelYear = mYear;
        System.out.println("Bike : "+bBrand+", Model : "+mName+", Model Year : "+mYear);
    }

    public bike(String bBrand, String mName, int mYear, double mil){
        bikeBrand = bBrand;
        modelName = mName;
        modelYear = mYear;
        mileage = mil;
        System.out.println("Bike : "+bBrand+", Model : "+mName+",  Model Year : "+mYear+", Mileage : "+mil);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        
        bike b1 = new bike("Honda");
        bike b2 = new bike("Suzuki", "Hayate");
        bike b3 = new bike("Yamaha", "MT 10", 2025);
        bike b4 = new bike("Royal Enfield", "Hunter 350", 2025, 35.2);

    }    
}
