import helper.LinkedList;
import helper.LinkedListNode;

import java.util.HashSet;

public class Two1RemoveDup {
    public static LinkedList removeDupHash(LinkedList list) {
        HashSet<Object> hash = new HashSet<Object>();
        LinkedListNode node = list.sentinel.next;

        while(node.isValid()) {
            if (hash.contains(node.item)) {
                node.deleteNode();
            } else {
                hash.add(node.item);
            }
            node = node.next;
        }
        return list;
    }

    public static LinkedList removeDupNoBuffer(LinkedList list) {
        LinkedListNode currentNode = list.sentinel.next;

        while (currentNode.isValid()) {
            LinkedListNode otherNode = currentNode.next;
            while (otherNode.isValid()) {
                if (otherNode.item.equals(currentNode.item)) {
                    otherNode.deleteNode();
                }
                otherNode = otherNode.next;
            }
            currentNode = currentNode.next;
        }
        return list;
    }
}
