
class car{
    String brandName;   
    String modelName;
    int modelYear;      
    // These are attributes of car, all the object of car have this. 

    public car(){
        //Object is created but attributes are null, may defined manually later
    }

    public car(String bName, String mName, int mYear){ 
        brandName = bName;
        modelName = mName;
        modelYear = mYear;
        // Parametrized Constructor, Attributes are assigned as Parameter
    }

    //Method
    public void printCar(){
        System.out.println("Brand : "+brandName+", Model : "+modelName+" , Model Year : "+modelYear);   // since this is same clss model we dont have use like car.modelName
    }
}

public class Constructor{
    public static void main(String[] args) {

        car mcl = new car("McLaren", "P1", 2014);
        car lmb = new car();

        mcl.printCar();
        lmb.printCar();
        lmb.brandName = "lamborghini";
        lmb.modelName = "Cenatario Roadster";
        System.out.println("After assigning Attributes : ");
        lmb.printCar();

    }
}

/*
Output : 
Brand : McLaren, Model : P1 , Model Year : 2014
Brand : null, Model : null , Model Year : 0
After assigning Attributes : 
Brand : lamborghini, Model : Cenatario Roadster , Model Year : 0
*/