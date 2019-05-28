import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        //modCount = 0
        List<String> list = new ArrayList<String>();
        list.add("h");//modCount = 1
        list.add("l");//modCount = 2
        list.add("e");//modCount = 3
        //expectedModCount = modCount = 3
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            //checkForModifacation
            //if(modCount != expectedModCount)
            String str = iterator.next();
            if(str.equals("h")){
                list.remove("h");
                continue;
            }
            System.out.println(str);
        }
    }
}
