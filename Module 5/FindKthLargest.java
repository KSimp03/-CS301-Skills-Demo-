//a program that finds the kth largest number in a list w/o sorting the entire list.
public class FindKthLargest {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 6, 5};
        int k = 2;

        int target = numbers.length - k;
        int left = 0;
        int right = numbers.length -1;

        //choose rando num for pivot within the array
        while(left<=right){
         int random = left + (int)(Math.random()*(right- left +1));

         // moves the pivot to the end of the list
         int temp = numbers[random];
         numbers[random]= numbers[right];
         numbers[right]= temp;
         int pivot = numbers[right];
         int i = left;

         //move all the smaller numbers to the left
            for (int j = left; j < right; j++){
                if(numbers[j]<pivot){
                   temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j]= temp;
                   i++;
                }
            }
            //Move pivot to the correct position
            temp = numbers[i];
            numbers[i]= numbers[right];
            numbers[right] = temp;
            //find kth
            if (i==target){
                System.out.println("Answer:  " + numbers[i]);
                break;
            }
            else if (i< target){
                left = i + 1;
            }
            else if (i > target){
                right = i - 1;
            }

        }
    }
}
