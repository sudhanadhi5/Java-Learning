public class Task6
{
    public static int MissingNumber(int[]arr,int n){
        int ExpectedSum=n* (n+1)/2;
        int ActualSum=0;

        for (int num :arr){
            ActualSum+=num;
        }
        return ExpectedSum-ActualSum;

}
    public static void main(String[]args) {
        int[] arr1 = {1, 2, 3, 4, 6, 7};
        int n1 = 7;
        System.out.println("The Missing Number is " + MissingNumber(arr1,n1));
        int[] arr2 = {1, 2, 4, 5};
        int n2 = 5;
        System.out.println("The Missing Number is " +MissingNumber(arr2,n2));
    }

    }