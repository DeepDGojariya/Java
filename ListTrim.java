// Assignment Problem 7
import java.util.*;

public class ListTrim {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> myList = strings.listIterator(); myList.hasNext(); ) {
            myList.set(myList.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" red ", " white ", " blue ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}