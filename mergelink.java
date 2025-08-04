class Node {
    int data;
    Node next;

    Node(int data) {
    this.data = data;
       this.next = null;
    }
}

public class mergelink {
    Node head;
    
    // public Node getIntersectionNode(Node headA, Node headB) {
    //     int lenA = getListLength(headA);
    //     int lenB = getListLength(headB);
    //     while (lenA > lenB) {
    //         headA = headA.next;
    //         lenA--;
    //     }
    //     while (lenB > lenA) {
    //         headB = headB.next;
    //         lenB--;
    //     }
        
    //     while (headA != headB) {
    //         headA = headA.next;
    //         headB = headB.next;
    //     }
    //     return headA; 
    // }
    void segregatedEvenOdd(){
    Node evenhead=null;
    Node oddhead=null;
    Node eventail=null;
    Node oddtail=null;
    Node current=head;
    while(current!=null){
        if(current.data%2==0){
            if(evenhead==null){
                evenhead=current;
                eventail=current;
                }
                else{
                    eventail.next=current;
                    eventail=current;
                    }
                    }
                    else{
                        if(oddhead==null){
                            oddhead=current;
                            oddtail=current;
                            }
                            else{
                                oddtail.next=current;
                                oddtail=current;
                                }
                                }
                            }
    }
    public void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
            }
        newNode.next=head;
        head=newNode;
                    
    }
    // public int getListLength(Node head) {
    //     int len = 0;
    //     while (head != null) {
    //         len++;
    //         head = head.next;
    //     }
    //     return len;
    // }

    public static void main(String[] args) {
        
        // Node intersect = new Node(42);
        // intersect.next = new Node(99);
        // Node headA = new Node(4);
        // headA.next = new Node(8);
        // headA.next.next = new Node(15);
        // headA.next.next.next = intersect;
        // Node headB = new Node(16);
        // headB.next = new Node(23);
        // headB.next.next = intersect;
        mergelink ll = new mergelink();
        ll.add(2);
        ll.add(5);
        ll.add(7);
        ll.add(8);  
        ll.add(9);
        ll.add(3);
        // Node intersectionNode = solution.getIntersectionNode(headA, headB);
        // if (intersectionNode != null) {
        //     System.out.println("Intersection node value: " + intersectionNode.val);
        // } else {
        //     System.out.println("No intersection node found.");
        // }
        ll.segregatedEvenOdd();
        ll.print();

    }
}
