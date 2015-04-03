import helper.LinkedList;
import helper.LinkedListNode;

public class Two2Kth {
    public static Integer findKth(LinkedList<Integer> list, int k) {
        LinkedListNode<Integer> node = list.getHead();

        if (node == null || k > list.size) {
            return null;
        }

        return find(node, k, 1);
    }

    private static Integer find(LinkedListNode<Integer> node, int k, int counter) {
        if (node.isValid()) {
            counter = find(node.next, k, counter) + 1;
            if (counter == k) {
                return node.item;
            } else if (counter > k) {
                return counter - 1;
            } else {
                return counter;
            }
        } else {
            return 0;
        }
    }
}
