class calculator1{
    public int add(int n1,int n2) {
      return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
        }

public class MethodOverLoadingExample {

    public static void main (String[] args)
    {
        calculator1 obj=new calculator1();
        int r1=obj.add(3,4,5);
        System.out.println(r1);
    }
}
