//import java.security.Key;
import java.util.*;

public class MapExample {

    public static void  main(String[]args){
        Map<String,Integer> Value=new LinkedHashMap<>();

        Value.put("Hello",1);
        Value.put("Welcome",2);
        Value.put("To",3);
        Value.put("Datasirpi",4);



        for (String key:Value.keySet())
        {
            System.out.println(key +"---"+Value.get(key));
        }


    }
}
