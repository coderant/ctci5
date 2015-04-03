import helper.LinkedList;
import helper.LinkedListNode;

public class Two3Test {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = makeList("987654321");
        LinkedList<Integer> list2 = makeList("111111119");

        System.out.println(list1);
        System.out.println(list2);


        LinkedListNode<Integer> node1 = list1.sentinel.next.next.next.next;
        LinkedListNode<Integer> node2 = list2.sentinel.next.next.next.next;

        Two3DeleteNode.deleteNode(node1);
        Two3DeleteNode.deleteNode(node2);

        System.out.println(list1);
        System.out.println(list2);
    }

    private static LinkedList<Integer> makeList(String str) {
        Integer[] c = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return new LinkedList<Integer>(c);
    }
}
