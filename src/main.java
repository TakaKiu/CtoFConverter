import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {

            double celsius;
            do {
                System.out.print("Enter the temperature in Celsius: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid temperature in Celsius: ");
                    scanner.next();
                }
                celsius = scanner.nextDouble();
            } while (celsius < 0);

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

            System.out.print("Do you want to convert another temperature? (Y/N): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("Y"));
    }
}