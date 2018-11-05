package com.algorithmpractice;

public class MinMax {

    public class Node {
        Node next;
        Node previous;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void minimum() {
        //Node current will point to head
        Node current = head;
        int min = head.data;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                //If current node's data is smaller than min
                //Then replace value of min with current node's data
                if (min > current.data) {
                    min = current.data;
                }
                current = current.next;
            } while (current != head);

            System.out.println("Minimum value node in the list: " + min);
        }
    }

    public static void main(String[] args) {

        MinMax dList = new MinMax();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);


        //Counts the nodes present in the given list
        dList.minimum();
    }
}