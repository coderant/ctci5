package helper;


public class LinkedList<E> {
    //a doubly linked list with sentinel

    public final LinkedListNode<E> sentinel;
    public int size = 0;

    public LinkedList() {
        sentinel = new LinkedListNode<E>(null, null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public LinkedList(E... items) {
        this();
        for (E e : items) {
            size++;
            add(e);
        }
    }

    public LinkedList(LinkedListNode<E> head) {
        this();
        while (head != null) {
            add(head.item);
            head = head.next;
        }
    }

    public LinkedListNode<E> getHead() {
        if (size == 0) {
            return null;
        } else {
            return sentinel.next;
        }
    }

    public void add(E item) {
        size++;
        sentinel.prev.next = new LinkedListNode<E>(item, sentinel.prev, sentinel, this);
        sentinel.prev = sentinel.prev.next;
    }

    @Override
    public String toString() {
        String str = "";
        LinkedListNode<E> node = sentinel.next;
        while (node.isValid()) {
            str += node.item + " ";
            node = node.next;
        }
        return str;
    }

//    public void add(LinkedList<E> list2) {
//        if (list2.size > 0) {
//            size += list2.size;
//            sentinel.prev.next = list2.getHead();
//            list2.getHead().prev = sentinel.prev;
//            sentinel.prev = list2.sentinel.prev;
//            list2.sentinel.next = sentinel;
//
//            LinkedListNode<E> node = list2.getHead();
//            while (node.isValid()) {
//                node.list = this;
//                node = node.next;
//            }
//        }
//    }
}
