import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
//How many circles? //How often should they be black?
// How small can a circle be? //How big can a circle be?
public class Circles {
    public static void main(String[] args) {
        int numberOfcircles = Integer.parseInt(args[0]); // first arg how many circles
        //double --> turns the txt into a decimal #
        // probability of circle being black
        double probabilityBlk = Double.parseDouble(args[1]); // arg 2
        double minRadius = Double.parseDouble(args[2]); // arg 3
        double maxRadius = Double.parseDouble(args[3]); // arg 4

        for (int i = 0; i < numberOfcircles;i++){
            double x = StdRandom.uniformDouble(0.0, 1.0); //draw in this box area
            double y = StdRandom.uniformDouble(0.0, 1.0);// draw in this box area
            double radius = StdRandom.uniformDouble(minRadius, maxRadius);
            boolean black = StdRandom.bernoulli(probabilityBlk); // bernoulli --> random

            if (black) {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(x, y, radius);
        }



    }
}

