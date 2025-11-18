import java.util.Scanner;

public class Task4 {

    public static void main(String[]args){
        int[]numbers={10, 7, 8, 3, 5, 9, 7};
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int index=Number.nextInt();

        if (index>=0 && index<numbers.length){
            int value=numbers[index];
            System.out.println("Value at index "+value);
        }
        else
            System.out.println("Error:The index "+index+" out of bound from the array");
    }
}