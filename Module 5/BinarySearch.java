public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {-3, -1, 2, 5, 8};

        int left = 0;
        // length of the list - 1 bc the index starts at 0
        int right = numbers.length - 1;
        //find the middle
        int middle = left + (right - left) / 2;

        //if middle # = index then print //if not seacrh left or right
        if (numbers[middle] == middle) {
            System.out.println("Found it at index " + middle);
        } else if (numbers[middle] > middle) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
    }

}

