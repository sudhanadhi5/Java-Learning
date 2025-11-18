import java.util.Scanner;

class Task2
{
    public static void main(String[]args)
    {
        Scanner Value = new Scanner(System.in);
        System.out.println("Enter the Number:");

        int Number=Value.nextInt();

        if (Number %2==0){
            System.out.println(Number +" is a Even Number");
        }
        else
            System.out.println(Number +" is a Odd Number");
    }
}