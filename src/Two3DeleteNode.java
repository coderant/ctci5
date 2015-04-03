import helper.LinkedListNode;

public class Two3DeleteNode {
    public static void deleteNode(LinkedListNode<Integer> node) {
        while (node.next.isValid()) {
            node.item = node.next.item;
            node = node.next;
        }
        node.deleteNode();
    }
}
