
public class LinkedLists {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void Addfirst(int data) {
        Node newnode = new Node(data);
        if (Head == null) {
            Head = Tail = newnode;
            size++;
            return;
        }
        newnode.next = Head;
        Head = newnode;
        size++;
    }

    public void Addlast(int data) {
        Node newnode = new Node(data);
        if (Tail == null) {
            Head = Tail = newnode;
            size++;
            return;
        }
        Tail.next = newnode;
        Tail = newnode;
        size++;
    }

    public void Addmiddele(int data, int index) {
        Node newnode = new Node(data);
        if (index == 0) {
            Head = Tail = newnode;
            size++;
            return;
        }

        Node temp = Head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;

    }

    public static int Removefirst() {
        int val;
        if (size == 0) {
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            val = Head.data;
            Head = Tail = null;
            size--;
            return val;
        }
        val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public static int Removelast() {
        int val;
        if (size == 0) {
            val = Integer.MIN_VALUE;
            return val;
        } else if (size == 1) {
            val = Head.data;
            size--;
            return val;
        }
        Node Prev = Head;
        for (int i = 0; i < size - 2; i++) {
            Prev = Prev.next;
        }
        val = Prev.next.data;
        Prev.next = null;
        Tail = Prev;
        size--;
        return val;
    }

    public static int Iterativesearch(int Key) {
        int index = 0;
        Node temp = Head;
        while (temp != null) {
            if (temp.data == Key) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public static int RecursiveSearch(int Key) {
        return Helper(Head, Key);
    }

    public static int Helper(Node Head, int Key) {
        if (Head == null) {
            return -1;
        }
        if (Head.data == Key) {
            return 0;
        }
        int index = Helper(Head.next, Key);
        if (index == -1) {
            return -1;
        }

        return index + 1;

    }

    public void Print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        LinkedLists Li = new LinkedLists();
        Li.Addfirst(1);
        Li.Addlast(2);
        Li.Addmiddele(3, 1);
        Li.Print();
        // Removefirst();
        // Li.Print();
        // Removelast();
        // Li.Print();
        System.out.println(RecursiveSearch(3));
    }
}
