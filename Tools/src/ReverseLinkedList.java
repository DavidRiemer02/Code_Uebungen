
import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}