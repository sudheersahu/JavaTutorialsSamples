package com.algorithmpractice;

public class CountList {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

        Node head, tail = null;

        public void addNode(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        //countNodes() will count the nodes present in the list
        public int countNodes() {
            int counter = 0;
            //Node current will point to head
            Node current = head;

            while (current != null) {
                //Increment the counter by 1 for each node
                counter++;
                current = current.next;
            }
            return counter;
        }

        public void display() {
            //Node current will point to head
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while (current != null) {
                //Prints each node by incrementing the pointer.

                System.out.print(current.data + " ");
                current = current.next;
            }

        }

    public static void main(String[] args) {

        CountList dList = new CountList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //Displays the nodes present in the list
        dList.display();

        //Counts the nodes present in the given list
        System.out.println("\nCount of nodes present in the list: " + dList.countNodes());
    }
}
