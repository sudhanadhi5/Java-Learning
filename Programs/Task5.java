import java.util.ArrayList;

public class Task5
{
    public static void main(String[]args)
    {
        ArrayList<String> List = new ArrayList<>();
        List.add(" Person 1");
        List.add(" Person 2");
        List.add(" Person 3");
        List.add(" Person 4");

        System.out.println("Array Elements :");
        for (String item:List){
            System.out.println(item);
        }
    }
}