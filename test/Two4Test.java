import helper.LinkedList;
import helper.LinkedListNode;

public class Two4Test {
    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = makeList("1111111111");
        LinkedListNode<Integer> list2 = makeList("987123456");
        LinkedListNode<Integer> list3 = makeList("1234567890");
        LinkedListNode<Integer> list4 = makeList("1234567890");
        LinkedListNode<Integer> list5 = makeList("1234567890");
        LinkedListNode<Integer> list6 = makeList("1234567890");


        System.out.println(Two4Partition.listPartition(list2, 3));
    }

    public static LinkedListNode<Integer> makeList(String str) {
        Integer[] c = new Integer[str.length()];
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> current = null;

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                head = new LinkedListNode<Integer>(Integer.parseInt(String.valueOf(str.charAt(i))));
                current = head;
            } else {
                current.next = new LinkedListNode<Integer>(Integer.parseInt(String.valueOf(str.charAt(i))));
                current = current.next;
            }
        }
        return head;
    }

}
