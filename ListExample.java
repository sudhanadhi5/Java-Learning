import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("Good Evening");
        arr.add("Good Morning");
        arr.add("Have a Nice Day");

        Iterator<String> it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
