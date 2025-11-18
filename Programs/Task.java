public class Task
{
 public  static void main(String[]args)
 {
     String Value="Java";
     String Reversed="";

     for(int i=Value.length() -1; i>=0; i--) {
         Reversed = Reversed + Value.charAt(i);
     }
     System.out.println("Reversed Value:"+Reversed);
 }
}