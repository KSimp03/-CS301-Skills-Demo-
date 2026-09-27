//Write a program DistanceSquared.java that takes two integer
// command-line arguments x and y and prints the
// Euclidean distance from the point (x, y) to the origin (0, 0), but squared.
//Entered 3 and 5 in the CLI arguments to get 34
public class DistanceSquared {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int distanceSquared = x * x + y * y;

        System.out.println(distanceSquared);
    }
}

