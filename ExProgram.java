class Box<T> {
    private T item;
   // private U price;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class ExProgram{

    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setItem("Books in the Box ");
        System.out.println(box.getItem());
    }
}
