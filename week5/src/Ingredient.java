import java.util.ArrayList;
import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    public Ingredient(String name, String measurementUnit) {
        this.name = name;
        this.setMeasurementUnit(measurementUnit);
    }

    public static Ingredient createIngredient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the ingredient: ");
        String name = sc.nextLine();
        System.out.println("Please enter the measurement unit of the ingredient: ");
        String measurementUnit = sc.nextLine();
        return new Ingredient(name, measurementUnit);
    }

    public void displayIngredient() {
        System.out.printf("The ingredient is %s and the measurement unit is %s\n", this.name, this.measurementUnit);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        String[] availableUnits = {"spoon", "teaspoon", "mg", "kg"};
        boolean matched = false;

        do {
            for (int i = 0; i < availableUnits.length; i++) {
                String unit = availableUnits[i];
                if (measurementUnit.equals(unit)) {
                    matched = true;
                }
            }

            if (matched)
                this.measurementUnit = measurementUnit;
            else {
                System.out.println("Error unit! Please reenter again:");
                Scanner sc = new Scanner(System.in);
                measurementUnit = sc.nextLine();
            }
        } while (!matched);
    }
}


