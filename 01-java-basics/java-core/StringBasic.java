public class StringBasic {
    public static void main (String[] args){

        String myString = "Ankit Pareek";
        System.out.println("String Length : "+myString.length());
        System.out.println("Lower Case : "+myString.toLowerCase());
        System.out.println("Upper Case : "+myString.toUpperCase());
        System.out.println("Index of 'P' "+myString.indexOf('P'));
        System.out.println("Index of 'P' "+myString.charAt(5));
        System.out.println("Index of \"Pareek\" : "+myString.indexOf("Pareek"));
        System.out.println("Removed White Space : " + myString.trim());

    }
}
