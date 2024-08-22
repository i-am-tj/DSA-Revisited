package BasicSet1;

import java.util.Scanner;

public class SumOfAllElementsInLL {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        Node head;
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) head = newNode;
            else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    public static int sum(Node head) {
        if(head == null) return 0;
        return head.data + sum(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinglyLinkedList l = new SinglyLinkedList();
        for (int i = 0; i < n; i++) {
            l.add(Integer.parseInt(sc.next()));
        }
        System.out.println("Sum of all elements in LL: " + sum(l.head));
    }

}
