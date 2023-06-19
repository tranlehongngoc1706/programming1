package Problem1;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String alphabeticCharacter = sc.nextLine();

        hasNoneAlphabetic noneAlphabetic = new hasNoneAlphabetic();

        if (noneAlphabetic.hasNoneAlphabetic(alphabeticCharacter)) {
            System.out.println("Invalid input. Please try again");
        } else {
            Output newOutput = new Output();
            System.out.println(newOutput.Output(alphabeticCharacter));
        }
    }
}
