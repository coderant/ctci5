import helper.LinkedList;
import helper.LinkedListNode;

//TODO Wrong
public class Two4Partition {
    public static LinkedList<Integer> listPartition(LinkedListNode<Integer> list, int x) {
        LinkedListNode<Integer> smallHead = null;
        LinkedListNode<Integer> largerHead = null;

        LinkedListNode<Integer> small = null;
        LinkedListNode<Integer> big = null;
        LinkedListNode<Integer> current = list;

        while (current.isValid()) {
            if (current.item <= x) {
                if (smallHead == null) {
                    smallHead = current;
                    small = smallHead;
                } else {
                    small = current;
                }
            } else {
                if (largerHead == null) {
                    largerHead = current;
                    big = largerHead;
                } else {
                    big.next = current;
                    big = current;
                    if (small != null) {
                        small.next = current.next;
                    }
                }
            }
            current = current.next;
        }
        if (small != null) {
            small.next = largerHead;
        }
        return new LinkedList<Integer>(smallHead);
    }
}
