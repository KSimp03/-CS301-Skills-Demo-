import edu.princeton.cs.algs4.StdRandom;

public class MyBeer {
    public static void main(String[] args) {

        // Get the number of guests
        int n = Integer.parseInt(args[0]);
        int matches = 0;
        // Run the party simulation 1,000 times
        for (int i = 0; i < 1000; i++) {

            // Make an array for the drinks
            int[] drinks = new int[n];

            // Give each person their original drink
            for (int x = 0; x < n; x++) {
                drinks[x] = x;
            }

            // Mix up all the drinks
            StdRandom.shuffle(drinks);

            // So far, nobody has matched
            boolean matched = false;

            // Check if anyone got their own drink
            for (int j = 0; j < n; j++) {

                if (drinks[j] == j) {
                    matched = true;
                }
                if (matched) {
                    matches++;
                }
            }
            double fraction = matches / 1000.0;
            System.out.println(fraction);
        }
    }
}

