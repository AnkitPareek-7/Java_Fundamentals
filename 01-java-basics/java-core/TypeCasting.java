public class TypeCasting {
    public static void main(String[] args){

        int myMarks = 8;
        double myDouble = myMarks;  //Widening TypeCsting. Automatic Conversion of Smaller Data Type to Larger Data Type 
        System.out.println("------ Widening Type Casting --------");
        System.out.println("Int : "+myMarks+" --> Double : "+myDouble);
        
        double herMarks = 9.5;
        int herInt = (int) herMarks; //Narrowing Type Casting, Manual Conversion of Larger Data Type to Smaller Data Type. Data May Lose
        System.out.println("------ Narrowing Type Casting --------");
        System.out.println("Double : "+herMarks+" --> Int : "+herInt);
    }
}

/*
Output :

------ Widening Type Casting --------
Int : 8 --> Double : 8.0
------ Narrowing Type Casting --------
Double : 9.5 --> Int : 9

*/