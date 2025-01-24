import java.util.*;

public class MyLinkedList {
  public static void main(String[] args) {
    //  **********************************************

    // LinkedList = stores Nodes in 2 parts ( data + address )
    //              Nodes are in non-consecutive memory locations 
    //              Elements are linked using pointers 

    //                                    Single Linked List 
    //                  Node                   Node              Node 
    //              [data | address] -> [data | address] -> [data | address]
    
    //                                  Doubly Linked List 
    //                        Node                          Node
    //             [address | data \ address] <-> [address | data | address]
                 
    //              advantages?
    //              1. Dynamic Data Structure (allocates needded memory while running)
    //              2. Insertion and deletation of nodes is easy. O(1)
    //              3. No/Low memory waste

    //              disadvantages?
    //              1. Greater memory usage (additional pointer)
    //              2. No random access of elements (no index [i])
    //              3. Accessing/searching elements is more time consuming. 0(n)
    
    //              uses?
    //              1. implement Stacks/Queues
    //              2. GPS navigation
    //              3. Music playlist 
      
    //  **********************************************

    LinkedList<String> linkedlist = new LinkedList<String>();

    /*
    linkedlist.push("A");
    linkedlist.push("B");
    linkedlist.push("C");      //messy order 
    linkedlist.push("D");
    linkedlist.push("E");
    linkedlist.pop();
    */
    
    linkedlist.offer("A");
    linkedlist.offer("B");
    linkedlist.offer("C");
    linkedlist.offer("D");
    linkedlist.offer("E");
    //linkedlist.poll();
    
    linkedlist.add(3, "f");
    linkedlist.remove("f");

   //System.out.println(linkedlist.indexOf("A"));
    System.out.println(linkedlist.peekFirst());
    System.out.println(linkedlist.peekLast());
    linkedlist.addFirst("0");
    linkedlist.addLast("G");
    String first = linkedlist.removeFirst();
    String last = linkedlist.removeLast();
  

    System.out.println(linkedlist);

  }

}
