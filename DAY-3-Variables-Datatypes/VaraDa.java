public class VaraDa 
{

    // Class variable (also known as Static variable or Class-level variable)
    static int classVariable = 100;

    // Instance variable
    int instanceVariable = 50;

    public void demonstrateVariables() {

        // Local variables (exist only within this method)
        int integerExample = 10;               // Integer data type
        float floatExample = 10.5f;            // Float data type (note the 'f' at the end)
        double doubleExample = 20.123456;      // Double data type
        char charExample = 'A';                // Character data type
        boolean booleanExample = true;         // Boolean data type
        String stringExample = "VaraDa";       // String data type (not primitive)
        long longExample = 1000000000L;        // Long data type (note the 'L' at the end)

        // Array example (collection of integers)
        int[] arrayExample = {1, 2, 3, 4, 5};

        // Output all values
        System.out.println("Integer: " + integerExample);
        System.out.println("Float: " + floatExample);
        System.out.println("Double: " + doubleExample);
        System.out.println("Character: " + charExample);
        System.out.println("Boolean: " + booleanExample);
        System.out.println("String: " + stringExample);
        System.out.println("Long: " + longExample);

        System.out.print("Array: ");
        for (int i = 0; i < arrayExample.length; i++) {
            System.out.print(arrayExample[i] + " ");
        }
        System.out.println();

        // Accessing instance and class (static) variables
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Class Variable: " + classVariable);
    }

    public static void main(String[] args)
    {
        // Create object to access instance variables and methods
        VaraDa obj = new VaraDa();
        obj.demonstrateVariables();
    }
}