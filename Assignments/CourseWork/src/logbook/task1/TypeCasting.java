package logbook.task1;

/*Write a Java program to declare integer, long and float data types. Following the methods of
 type casting, demonstrate implicit and explicit type casting amongst the declared data types. */

public class TypeCasting {
    static void example() {
        //Implicit casting: smaller data type convert into larger data type
        longNum = integerNum; // Implicit casting from int to long
        floatNum = longNum; // Implicit casting from long to float

        // Explicit casting: larger data type convert into smaller data type
        integerNum = (int) longNum; // Explicit casting from long to int
        int explicitFloat = (int) floatNum; // Explicit casting from float to int (truncation)

        // Print values after type casting
        System.out.println("Integer after implicit casting from int to long: " + longNum);
        System.out.println("Float after implicit casting from long to float: " + floatNum);
        System.out.println("Integer after explicit casting from long to int: " + integerNum);
        System.out.println("Float after explicit casting from float to int (truncated): " + explicitFloat);
    }
    public static void main(String[] args) {
        example();

    }
    // Declare integer, long, and float data types
    private static int integerNum = 30;
    private static long longNum = 40000000000L;
    private static float floatNum = 50.18f;
}

