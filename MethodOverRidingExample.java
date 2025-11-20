class A{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class B extends A {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
public class MethodOverRidingExample {

    public static void main(String[] args){
        B obj=new B();
        int r1=obj.add(2,3,4);
        System.out.println(r1);

    }
}
