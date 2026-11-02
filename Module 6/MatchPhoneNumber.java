public class MatchPhoneNumber {
    public static void main(String[] args) {
        //? ==> makes the space and the parthesis optional
        //==> \\ = parthesis
        String regex = "(\\(\\d{3}\\) ?)?\\d{3}-\\d{4}";
        String phone = "(360)555-1234";

        boolean valid = phone.matches(regex);

        System.out.println(valid);
    }
}
