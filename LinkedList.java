package List;

/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList<E> implements List<E>
{

    int size=0;
    Node<E> head=new Node<E>(null,null,null);
    Node<E> tail=new Node<E>(null,null,head);
    private Node<E> ref;

    public LinkedList()
    {
        head.next=tail;
    }   

    public E get(int ndx)
    {
        setRef(ndx);
        return ref.value;

    }

    private void setRef(int ndx)
    {
        ref=head.next;
        for(int i=0; i<ndx;i++)
        {
            ref=ref.next;
        }

    }

    public E set (int ndx, E value)
    {
        setRef(ndx);
        E result=ref.value;
        ref.value=value;
        return result;
    }

    public void add(E value)
    {
        Node <E> temp = new Node<E>(value,ref,ref.prev);
        tail.prev.next=temp;
        tail.prev=temp;
        size++;
    }

    public void add(int ndx, E value)
    {
        setRef(ndx);
        Node temp = new Node<E>(value,ref,ref.prev);
        ref.prev.next=temp;
        ref.prev=temp;
        size++;
    }

    public E remove(int ndx)
    {
        setRef(ndx);
        ref.prev.next=ref.next;
        ref.next.prev=ref.prev;
        size--;
        return ref.value;
    }

    public int indexOf(Object obj){
        int index = 0;
        ref = head.next;
        while (ref != tail) {
            if (obj == null ? ref.value == null : obj.equals(ref.value)) {
                return index;
            }
            ref = ref.next;
            index++;
        }
        return -1; // Object not found in the list
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }

    public void clear() {
        // Remove all elements from the linked list
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
