import edu.princeton.cs.algs4.StdDraw;

public class Banner {
    public static void main(String[] args) {

        // Get the word from the 
        String s = args[0];

        // Get the speed
        int speed = Integer.parseInt(args[1]);

        // Start the message on the left side of the screen
        double x = 0.0;

        // Keep the banner moving continuously
        while (true) {

            // Erase the old message before drawing it again
            StdDraw.clear();

            // Draw the message at its current x position
            // 0.5 keeps it in the middle vertically
            StdDraw.text(x, 0.5, s);

            // Pause before drawing again
            // A bigger number means a longer pause
            StdDraw.pause(speed);

            // Move the message a little to the right
            x += 0.01;

            // If the message reaches the right side,
            // move it back to the left side
            if (x >= 1.0) {
                x = 0.0;
            }
        }
    }
}
