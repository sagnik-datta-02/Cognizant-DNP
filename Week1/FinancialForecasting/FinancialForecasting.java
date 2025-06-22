public class FinancialForecast {

    public static double forecastValue(double initialAmount, double rate, int years) {

        if (years == 0) {
            return initialAmount;
        }

        return forecastValue(initialAmount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000; 
        double growthRate = 0.05;     
        int years = 5;

        double futureValue = forecastValue(initialAmount, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, futureValue);
    }
}
