
public class Partition {

    public static void partition(int n, int max, String result) {

        if (n == 0) {
            System.out.println(result);
            return;
        }

        for (int i = Math.min(n, max); i >= 1; i--) {

            String newResult = result + i + " ";

            partition(n - i, i, newResult);
        }
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        partition(n, n, "");
    }
}
