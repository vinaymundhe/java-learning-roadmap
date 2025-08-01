package intermediate.java8;

import java.util.ArrayList;
import java.util.List;

/*
List<Integer> a = 1,3,5,7,8
List<Integer> b = 3,6,5

Find the elements which are present in both the list using java 8

output = List<Integer> c = 3,5
 */
public class ElementsInBothLists {
    public static void main (String [] args){

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(8);

        List<Integer> b = new ArrayList<>();
        a.add(3);
        a.add(6);
        a.add(5);

        for (Integer i : a) {
            if (i.equals(b.stream().toList())){

            }
        }

    }

}
