class vehicle{
    int wheeler;

    public vehicle(int x){
        this.wheeler = x;
    }

    public void vehicleIdea(){
        System.out.println("This is a "+this.wheeler+" wheeler");
    }
}

class bike extends vehicle{
    String brand;
    String color;
    
    public bike(String brand, String color){
        super(2);
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void vehicleIdea(){
        super.vehicleIdea();
        System.out.print("A "+this.color+" "+this.brand+" bike.");
    }
}


public class ThisAndSuper {
    public static void main(String[] args) {
        
        bike b1 = new bike("BMW","Red and White");

        b1.vehicleIdea();
    }

}

/*
Output : 

This is a 2 wheeler
A Red and White BMW bike.
*/