class exercise5 {
    public static void randomNumberProgram() {
        // keyword "final" indicates constants (unchanged values)
        final int MIN = 0;
        final int MAX = 9;
        final int RANGE = MAX - MIN + 1;

        int[] count = new int[RANGE];
        final int NUM = 100;
        System.out.println("Generate 100 integers in range [0,9] and count each number");
        // Loop to generate the NUM numbers of random numbers and count each occurrence in the count array
        for (int i = 0; i < NUM; i++) {
            // Math.random() returns a number greater than or equal 0.0 and less than 1.0
            int rand = (int) (Math.random() * RANGE) + MIN;
            // This works because of the default values for count elements are 0
            count[rand]++;
        }
        // Print out the frequency of those random generated numbers
        for (int i = 0; i < RANGE; i++) {
            if (count[i] != 0) {
                System.out.println((i+MIN) + ": " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        randomNumberProgram();
    }
}