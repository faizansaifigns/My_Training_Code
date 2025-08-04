import java.util.*;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class merge {

    public Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int getListLength(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // Utility method to create a linked list from an array of values
    public Node createListFromArray(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        merge solution = new merge();

        System.out.print("Enter number of elements in List A: ");
        int nA = sc.nextInt();
        int[] arrA = new int[nA];
        System.out.println("Enter elements of List A:");
        for (int i = 0; i < nA; i++) {
            arrA[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in List B: ");
        int nB = sc.nextInt();
        int[] arrB = new int[nB];
        System.out.println("Enter elements of List B:");
        for (int i = 0; i < nB; i++) {
            arrB[i] = sc.nextInt();
        }

        // Optionally build intersection
        System.out.print("Do you want to add intersection? (yes/no): ");
        String choice = sc.next();

        Node intersect = null;
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter number of elements in intersection: ");
            int nI = sc.nextInt();
            int[] arrI = new int[nI];
            System.out.println("Enter elements of intersection part:");
            for (int i = 0; i < nI; i++) {
                arrI[i] = sc.nextInt();
            }
            intersect = solution.createListFromArray(arrI);
        }

        Node headA = solution.createListFromArray(arrA);
        Node headB = solution.createListFromArray(arrB);

        // Attach intersection part to List A
        if (intersect != null) {
            Node temp = headA;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            if (temp != null) temp.next = intersect;

            temp = headB;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            if (temp != null) temp.next = intersect;
        }

        Node intersectionNode = solution.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection node found.");
        }

        sc.close();
    }
}
