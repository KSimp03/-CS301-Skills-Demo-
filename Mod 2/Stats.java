import edu.princeton.cs.algs4.StdIn;

public class Stats {
    public static void main(String[] args) {

        // Get how many numbers the user will enter
        int n = Integer.parseInt(args[0]);

        // Make an array to store the numbers
        double[] numbers = new double[n];

        // Keep track of the total of all the numbers
        double sum = 0.0;

        // Read n numbers from the user
        for (int i = 0; i < n; i++) {
            numbers[i] = StdIn.readDouble();
            sum += numbers[i];
        }

        // Calculate the average
        double mean = sum / n;

        // Keep track of the squared differences from the mean
        double squaredDifferences = 0.0;

        // Find how far each number is from the mean
        for (int i = 0; i < n; i++) {
            double difference = numbers[i] - mean;
            squaredDifferences += difference * difference;
        }

        // Calculate the sample standard deviation
        double standardDeviation =
                Math.sqrt(squaredDifferences / (n - 1));

        // Print the results
        System.out.println("Mean: " + mean);
        System.out.println("Sample standard deviation: " + standardDeviation);
    }
}

