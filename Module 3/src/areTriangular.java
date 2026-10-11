public class areTriangular {

    public static boolean areTriangular(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        System.out.println(areTriangular(3, 4, 5));
        System.out.println(areTriangular(5, 5, 10));
    }
}
