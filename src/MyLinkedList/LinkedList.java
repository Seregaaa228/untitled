package MyLinkedList;

public class LinkedList {
    Node first;
    Node last;
    int size;

    class Node {
        int element;
        Node next;
        Node previous;

        public Node(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public int getElement() {
            return element;
        }

    }

    public int get(int i) {
        int n = indexOf(first);
        Node current = first;
        current = current.next;
        System.out.println(current.element);
        return current.element;

    }

    private int indexOf(Node link) {
        if (link == null) {
            return -1;
        }
        return 1 + indexOf(link.next);
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException();
    }

    public void add(int element) {
        Node newNode = new Node(element);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    Node node(int index) {


        if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }

    public String toString() {
        System.out.println("Size : " + size);
        String Str = "Contents:\n";


        Node current = first;
        while (current != null) {
            Str += current.getElement() + "\n";
            current = current.getNext();

        }
        return Str;
    }

    public Integer set(int index, Integer element) {
        checkElementIndex(index);
        Node x = node(index);
        Integer oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    public void add(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (index == 0) {
            add(element);
        }
        if (index == size) {
            last.next = newNode;
            last = newNode;
        }
        Node oldNode = first;
        for (int i = 0; i < index; i++) {
            oldNode = oldNode.next;
        }
        Node oldPrevious = oldNode.previous;
        oldPrevious.next = newNode;
        oldNode.previous = newNode;

        newNode.previous = oldPrevious;
        newNode.next = oldNode;
        size++;
    }

    public void remove(int index) {
        if (index == 0) {

            first = first.next;
        } else {

            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 3);
        list.set(0, 5);
        list.remove(4);


        System.out.println(list);
        list.get(1);
    }
}




