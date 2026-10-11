import java.util.Arrays;
import java.util.Random;
public class SAT {
    public static void main(String[] args) {
        // Create 20,000 student scores
        double[] scores = new double[20000];
        Random random = new Random();

        // Generate normally distributed SAT scores
        for (int i = 0; i < scores.length; i++) {
            scores[i] = 1200 + 100 * random.nextGaussian();
        }

        // Sort scores from lowest to highest
        Arrays.sort(scores);

        // Find the lowest score in the top 5,000
        double cutoff = scores[15000];

        System.out.println("Lowest admitted SAT score: "
                + Math.ceil(cutoff));
    }
}
