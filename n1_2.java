import com.sun.javafx.collections.transformation.SortedList;
import sun.misc.Sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 21.06.13
 * Time: 8:55
 * To change this template use File | Settings | File Templates.
 */

//1.2 Дан массив из целых чисел. Известно, что одно из
// чисел встречается дважды. Найти это число за O(n)
public class n1_2 {
    private int FindSameN(){
     ArrayList <Integer> arrList = new ArrayList();
            arrList.add(10);
            arrList.add(3);
            arrList.add(2);
            arrList.add(8);
            arrList.add(6);
            arrList.add(3);
            arrList.add(4);
            arrList.add(20);

        Collections.sort(arrList);
        for (int i = 0; i<arrList.size(); i++) {
            if(i != 0 && arrList.get(i).equals(arrList.get(i - 1))) {
                return arrList.get(i);
            }
        }
        return 0;
}
    public static void main(String[] args){
        n1_2 n = new n1_2();
        System.out.println(n.FindSameN());
    }

}
