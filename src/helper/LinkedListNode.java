package helper;

public class LinkedListNode<E> {
    public E item;
    public LinkedListNode<E> prev;
    public LinkedListNode<E> next;
    private LinkedList<E> list;

    public LinkedListNode(E item, LinkedListNode<E> prev, LinkedListNode<E> next, LinkedList<E> list) {
        this.item = item;
        this.prev = prev;
        this.next = next;
        this.list = list;
    }

    public E deleteNode() {
        if (list != null) {
            list.size--;
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.list = null;
            return item;
        } else {
            throw new IllegalAccessError("Trying to delete a null node");
        }
    }

    public boolean isValid() {
        return list != null;
    }
}
