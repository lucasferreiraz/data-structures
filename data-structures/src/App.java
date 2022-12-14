import structures.List;
import structures.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vector vector = new Vector(5);

        vector.add( 10); //0
        vector.add(20); //1
        vector.add(30); //2
        vector.add(40); //3
        vector.add(50); //4

        System.out.println(vector);

        List<String> list = new List<>(5);

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.add("f");

        list.remove(1);

        System.out.println(list);

    }
}
