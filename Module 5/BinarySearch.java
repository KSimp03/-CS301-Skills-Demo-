public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {-3, -1, 2, 5, 8};

        int left = 0;
        // number.length - 1 bc the index starts at zero
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            //Check for the middle num in the array
            int middle = left + (right - left) / 2;
            // if the number is equal to the index print
            if (numbers[middle] == middle) {
                System.out.println("Found at index " + middle);
                found = true;
                break;
             // search either left or right to find a match
            } else if (numbers[middle] > middle) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        //! --> if not found print
        if (!found) {
            System.out.println("No matching index found.");
        }
    }
}
