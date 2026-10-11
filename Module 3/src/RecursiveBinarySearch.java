public class RecursiveBinarySearch {
    public static boolean search(int[] numbers,int target ,int left , int right) {
        //base case
        if (left > right) {
            return false;
        }

        int middle = left + (right - left) / 2;
        if (numbers[middle] == target) {
            return true;
        }

        if(target < numbers[middle]){
            return search(numbers, target, middle -1,left);
        }
            else{
                return search(numbers, target, middle +1,right);
            }
        }



    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 17, 21, 35, 48};
        System.out.println(search(numbers,8,0,6));
        System.out.println(search(numbers,19,0,6));
    }
}
