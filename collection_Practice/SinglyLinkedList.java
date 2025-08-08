package collection_Practice;

import java.util.*;

public class SinglyLinkedList {
    
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }
    
    public void print() {
        Node current = head;
        boolean first = true;
        
        while (current != null) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(current.data);
            current = current.next;
            first = false;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfElements = scanner.nextInt();
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        list.reverse();
        
        list.print();
        
        scanner.close();
    }
}