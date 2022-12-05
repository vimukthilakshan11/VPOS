/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

    
    
    
    public class DDL {

    //A node class for doubly linked list
    class Node {

        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    //Initially, heade and tail is set to null
    Node head, tail = null;

    //add a node to the list  
    public void addNode(int item) {
        //Create a new node  
        Node newNode = new Node(item);

        //if list is empty, head and tail points to newNode  
        if (head == null) {
            head = newNode;
            tail = newNode;
    
        } else {
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.previous = tail;
            //newNode becomes new tail  
            tail = newNode;
            //tail's next point to null  
            tail.next = null;
        }
    }

//print all the nodes of doubly linked list  
    public void printNodes() {
        //Node current will point to head  
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            //Print each node and then go to next.  
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

    public void printNodes2() {
        //Node current will point to head  
        Node current = tail;
        if (tail == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            //Print each node and then go to next.  
            System.out.print(current.item + " ");
            current = current.previous;
        }
    }
    
    
        public static void main(String[] args) {
        //create a DoublyLinkedList object
        DDL dl_List = new DDL();
        //Add nodes to the list  
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);

        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();
        dl_List.printNodes2();
    }
}


