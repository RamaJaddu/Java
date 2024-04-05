package logbook.task10;

public class ArrayAverageCalculator {

    static void averageElementsOfArray(){
        // Define an array with 10 numeric values
        int[] array = {2, 5, 3, 4, 6, 6, 7, 8, 9, 10};

        // Calculate the sum of all elements in the array

        for (int num : array) {
            sum += num;
        }

        System.out.println("Total of array elements : "+ sum);

        // Calculate the average value
         average = (sum / array.length);

        // Display the average value
        System.out.println("Average value of array elements: " + average);
    }

    public static void main(String[] args) {
        averageElementsOfArray();
    }
   private static int sum = 0;
   private static double average;
}
