public class Task3
        {
           public static void main(String[]args)
           {
               int[]num={10, 7, 8, 3, 5, 9, 7};
               int smallest=num[0];

               for (int i=1;i < num.length;i++){
                   if(num[i]<smallest){
                       smallest=num[i];
                   }
               }
               System.out.println("The Smallest number of the Array is "+ smallest);
           }
                }
