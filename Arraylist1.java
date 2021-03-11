import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList tut = new ArrayList();
        tut.add(10);
        tut.add(101);
        tut.add("Ankara");

        for(Object i: tut){
            System.out.println(i);
        }

        //tut.remove(0)-->new 0 index value=101
        //tut.clear()-->clears the tut
        //ArrayList<String> tut = new ArrayList<String>()--only string expression type-safe



    }
}
