import java.util.Scanner;
public class CurrencyConverter {
    public static double convertCurrency(double amount, double rate) {
        return amount * rate;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base currency : ");
        String baseCurrency = input.next().toUpperCase();
        System.out.print("Enter the target currency : ");
        String targetCurrency = input.next().toUpperCase();
        System.out.print("Enter the amount to convert: ");
        double amount = input.nextDouble();
        double rate = 0.92; 
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            rate = 0.92;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            rate = 1.09;
        } else {
            System.out.println("Exchange rate not available for selected currencies.");
            return;
        }
        double convertedAmount = convertCurrency(amount, rate);
        System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);

        input.close();
    }
}
