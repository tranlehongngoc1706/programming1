import java.util.Scanner;

public class week3 {
    // Helper method to print out an array
    public static void printArray(int[] numbers) {
        // Enhanced for loop to print out all elements in the array
        for (int i : numbers)
            System.out.printf("%d ", i);
        System.out.println();
    }

    // Exercise 1
    public static int[] generateRandomNumberArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many random numbers to generate for the array: ");
        int numberOfNumbers = sc.nextInt();
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++)
            array[i] = (int) Math.round(Math.random()* numberOfNumbers);
        return array;
    }

    // Exercise 2
    public static int getIndexMin(int[] numbers) {
        if (numbers.length == 0)
            return -1;

        int indexMin = 0;
        for (int i = 1; i < numbers.length;i++) {
            if (numbers[i] < numbers[indexMin])
                indexMin = i;
        }
        return indexMin;
    }

    // bonus task - exercise 2
    public static double minimum(double... n) {
        int k = 0;
        double min = n[k];
        int minIndex = k;

        for (double i : n) {
            k++;
            if (i < min) {
                min = i;
                minIndex = k-1;
            }
        }
        return minIndex;
    }

    // Exercise 3
    public static int getIndexMinFrom(int[] numbers2, int from) {
        if (numbers2.length == 0 || from < 0 || from >= numbers2.length)
            return -1;

        int indexMin = from;
        for (int i = from + 1 ; i < numbers2.length;i++) {
            if (numbers2[i] < numbers2[indexMin])
                indexMin = i;
        }
        return indexMin;
    }

    // Exercise 4
    public static int[] exchangeMinFrom(int[] numbers2, int from) {
        // Use the result of exercise 3 method to find the index of the smallest number from given index
        int index = getIndexMinFrom(numbers2,from);
        if (index == -1)
            return numbers2;
        // classic way to swap two numbers
        int temp = numbers2[from];
        numbers2[from] = numbers2[index];
        numbers2[index] = temp;
        return numbers2;
    }

    // Exercise 5
    public static void sortBySelection(int[] numbers2) {
        for (int exchangedIndex = 0; exchangedIndex < (numbers2.length - 2); exchangedIndex++) {
            exchangeMinFrom(numbers2, exchangedIndex);
        }
    }

    // Main program
    public static void main(String[] args) {
        // Exercise 1
        int[] myNumbers = generateRandomNumberArray();
        System.out.println("The generated array is:");
        printArray(myNumbers);

        // Exercise 2
        int smallestIndex = getIndexMin(myNumbers);
        System.out.printf("The index of the smallest number in the array parameter number is %d at the index %d\n",myNumbers[smallestIndex],smallestIndex);

        // bonus task- exercise 2
        System.out.println("Minimum number index is " + (int) minimum(4.2, 3.1, 1.5, 1.3));

        // Exercise 3
        int fromIndex = 4;
        int smallestIndexFrom = getIndexMinFrom(myNumbers, fromIndex);
        System.out.printf("The smallest number is %d at the index %d from the index %d.\n", myNumbers[smallestIndexFrom], smallestIndexFrom, fromIndex);

        // Exercise 4
        int[] exchangedArray = exchangeMinFrom(myNumbers,fromIndex);
        System.out.println("The exchanged array is:");
        printArray(exchangedArray);

        // Exercise 5
        sortBySelection(myNumbers);
        System.out.println("The sorted array is:");
        printArray(myNumbers);
    }
}
