import java.util.Scanner;

public class Linklist{

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int data) {
        head = insertRecursive(head, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = insertRecursive(current.next, data);
        return current;
    }

    public void printList() {
        printRecursive(head);
    }

    private void printRecursive(Node current) {
        if (current == null) {
            System.out.print("NULL");
            return;
        }
        System.out.print("[ " + current.data + " ] -> ");
        printRecursive(current.next);
    }

    public static void main(String[] args) {
        Linklist list = new Linklist();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to add to the list? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list.insert(number);
        }

        scanner.close();
        list.printList();
    }
}
    
}
