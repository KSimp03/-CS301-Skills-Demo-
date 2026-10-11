public class ReverseString {
    public static String reverse(String word) {
        // Base case
        if (word.length() <= 1) {
            return word;
        }

        // Recursive step
        //substring() is a Java String method that extracts part of a String,
        // starting at a specific index (position)
        return reverse(word.substring(1)) + word.substring(0,1);
    }

    public static void main(String[] args) {
        //call function reverse for the string "KYEISHA"
        System.out.println(reverse("KYEISHA"));
    }
}
