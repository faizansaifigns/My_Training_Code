
class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x; // FIXED
        this.next = null;
    }
}

public class segregatedlist {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void segregatedEvenOdd() {
        Node evenhead = null, oddhead = null;
        Node eventail = null, oddtail = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; 
            current.next = null;         

            if (current.data % 2 == 0) {
                if (evenhead == null) {
                    evenhead = eventail = current;
                } else {
                    eventail.next = current;
                    eventail = current;
                }
            } else {
                if (oddhead == null) {
                    oddhead = oddtail = current;
                } else {
                    oddtail.next = current;
                    oddtail = current;
                }
            }

            current = nextNode;
        }

        
        if (evenhead != null) {
            head = evenhead;
            eventail.next = oddhead;
        } else {
            head = oddhead;
        }
        if (oddtail != null)
            oddtail.next = null;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        segregatedlist ll = new segregatedlist();
        ll.add(2);
        ll.add(5);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(3);

        System.out.println("Original list:");
        ll.print();

        ll.segregatedEvenOdd();

        System.out.println("After segregating even and odd:");
        ll.print();
    }
}
