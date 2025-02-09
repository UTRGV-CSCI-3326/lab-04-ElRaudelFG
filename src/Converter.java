
public class Converter{
    public static void main(String[] args){ //work place

        // Convert the string strFloat into a float.
        String strFloat = "374.25";
        float from_strFloat = Float.parseFloat(strFloat); // assign here
        System.out.println("String to float: " + from_strFloat); // Verify

        // Convert the string strInt into an integer.
        String strInt = "1250";
        int from_strInt = Integer.parseInt (strInt); // assign here
        System.out.println("String to int: " + from_strInt); // Verify

        // Convert the float floatNum into an integer.
        float floatNum = 56.715f;
        int from_floatNum = (int) floatNum; // assign here
        System.out.println("Float to int: " + from_floatNum); // Verify

        // Convert the integer intNum into a float.
        int intNum = 1500;
        float from_intNum = (float) intNum; // assign her
        System.out.println("Int to float: " + from_intNum); // Verify

        // Convert the double doubleNum into a string.
        double doubleNum = 3.14159265;
        String from_doubleNum = " " + doubleNum; // assign here
        System.out.println("Double to string: " + from_doubleNum); // Verify
        
        //I dont know if im supposed to the user input lab4-expected.png
    }
}