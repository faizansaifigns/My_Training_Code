
import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class arrrtolist {
    Node headNode;

    public void buildlist(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            headNode = null;
            return;
        }
        headNode = new Node(arr[0]);
        Node tailNode = headNode;
        for (int i = 1; i < arr.length; i++) {
            tailNode.next = new Node(arr[i]);
            tailNode = tailNode.next;
        }
    }

    public void print() {
        if (headNode == null) {
            System.out.println("List is empty.");
            return;
        }
        Node tempNode = headNode;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arrrtolist list1 = new arrrtolist();
        list1.buildlist(arr);
        list1.print();
    }
}
