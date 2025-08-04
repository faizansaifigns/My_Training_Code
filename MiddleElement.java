import java.util.*;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }

    Node(int data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class MiddleElement {
    Node headNode;

    public List<Integer> findMiddle() {
    List<Integer> result = new ArrayList<>();

    if (headNode == null) {
        return result;
    }

    Node slowNode = headNode;
    Node fastNode = headNode;
    Node prevSlow = null;

    while (fastNode != null && fastNode.next != null) {
        prevSlow = slowNode;
        slowNode = slowNode.next;
        fastNode = fastNode.next.next;
    }
    if (fastNode == null && prevSlow != null) {
        result.add(prevSlow.val);
        result.add(slowNode.val);
    } else {
        result.add(slowNode.val);
    }

    return result;
}


    public void buildList(int[] arr) {
        if (arr.length == 0) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MiddleElement s = new MiddleElement();
        s.buildList(arr);
        Integer middle = s.findMiddle();

        if (middle != null) {
            System.out.println("Middle element: " + middle);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
