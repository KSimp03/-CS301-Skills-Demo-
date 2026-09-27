//Write a program TwentyFivePerLine.java that, using one for loop and one if statement,
// prints the integers from 1000 to 2000 with 25 integers per line.
// Hint: use the % operator.
public class TwentyFivePerLine {
    public static void main(String[] args) {
        for(int i = 1000; i <= 2000; i++){
            System.out.print(i + "   ");
            if((i - 999) % 25 == 0){
                System.out.println();
            }
        }


    }
}

