public class CToFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (double celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%.1f\t%.1f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 1.8) + 32;
    }

}
