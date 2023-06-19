// Write a program that uses a suitable loop to display a conversion table, knowing that 1 mile is 1.609 kilometres.

public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Miles \t Kilometers");
        for (int m = 1; m < 10; m++) {
            double kilometer = m*1.609;
            System.out.printf(" %d \t\t %.2f\n",m,kilometer); // 2 decimal numbers: %.2f
        }
        System.out.println();

        System.out.println("Kilometers \t Miles");
        for (int k = 20; k < 65; k+=5) {
            double mile = k/1.609;
            System.out.printf(" %d \t\t %.2f\n",k,mile); // 2 decimal numbers: %.2f
        }
    }
}
