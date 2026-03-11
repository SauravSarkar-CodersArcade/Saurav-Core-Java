package dataStructures.linear.linkedLists;

import java.util.*;

public class LinkedListMaster {

    static Node head = null;

    // Insert Node
    static void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display List
    static void display() {

        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Reverse List
    static void reverse() {

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
        System.out.println("List Reversed");
    }

    // Print Even Nodes
    static void printEven() {

        Node temp = head;

        System.out.println("Even Nodes:");

        while (temp != null) {

            if (temp.data % 2 == 0) {
                System.out.print(temp.data + " ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Print Odd Nodes
    static void printOdd() {

        Node temp = head;

        System.out.println("Odd Nodes:");

        while (temp != null) {

            if (temp.data % 2 != 0) {
                System.out.print(temp.data + " ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Floyd Cycle Detection
    static boolean detectCycle() {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- LINKED LIST MENU ---");
            System.out.println("1 Insert Node");
            System.out.println("2 Display List");
            System.out.println("3 Reverse List");
            System.out.println("4 Print Even Nodes");
            System.out.println("5 Print Odd Nodes");
            System.out.println("6 Detect Cycle");
            System.out.println("7 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter value:");
                    int val = sc.nextInt();
                    insert(val);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    reverse();
                    break;

                case 4:
                    printEven();
                    break;

                case 5:
                    printOdd();
                    break;

                case 6:
                    if (detectCycle())
                        System.out.println("Cycle Detected");
                    else
                        System.out.println("No Cycle");
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}