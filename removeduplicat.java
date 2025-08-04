
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data; // FIXED
        this.next = null;
    }
}
public class removeduplicat{
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void removedup(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
    
    else{
        temp=temp.next;
    }
}
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
        removeduplicat list = new removeduplicat();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.print();
        list.removedup();
        list.print();
        
}
}