package dataStructures.linear.linkedLists.problems;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class PalindromeLinkedList {

    static boolean isPalindrome(Node head) {

        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        // Push all elements into stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare stack with list
        while (head != null) {
            if (head.data != stack.peek()) {
                return false;
            }
            stack.pop();
            head = head.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}