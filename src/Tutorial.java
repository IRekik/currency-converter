import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tutorial {
    // All values are in USD
    public static double USD = 1;
    public static double EUR = 0.90;
    public static double CAD = 1.33;
    public static double AUD = 1.5139;
    public static double JPY = 141.05;
    public static double CPY = 7.06;
    public static double CHF = 0.87;

    // Convert static method
    public static double convert (double c1, double c2, double amount) {
        double conversion;
        conversion = (c2/c1) * amount;
        return conversion;
    }

    public static void main(String[] args) {
        // Declare variables
        Scanner sc = new Scanner(System.in);
        String input1;
        String input2;
        double input3;
        double conversion;

        // Map currency names to their values
        Map<String, Double> currencyMap = new HashMap<>();
        currencyMap.put("USD", USD);
        currencyMap.put("EUR", EUR);
        currencyMap.put("CAD", CAD);
        currencyMap.put("AUD", AUD);
        currencyMap.put("JPY", JPY);
        currencyMap.put("CPY", CPY);
        currencyMap.put("CHF", CHF);

        // Enter currencies and amount
        System.out.println("What is your currency?");
        input1 = sc.nextLine();
        System.out.println("To which currency do you want to convert to?");
        input2 = sc.nextLine();
        System.out.println("How much currency do you want to convert?");
        input3 = sc.nextDouble();

        // Get result and display it
        conversion = convert(currencyMap.get(input1), currencyMap.get(input2), input3);
        System.out.println("For " + input3 + " " + input1 + ", you have " + conversion + " " + input2);
    }
}
