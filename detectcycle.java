


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data; // FIXED
        this.next = null;
    }
}
public class detectcycle{
     Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
                }
                }
                return false;
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
        detectcycle list = new detectcycle();
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(6);
        
        System.err.println(list.detectCycle());
        list.print();
    }



}