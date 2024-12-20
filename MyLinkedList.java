import java.util.*

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

    //
      
    //  **********************************************

    LinkedList<String> linkedlist = new LinkedList<String>();


  }
}
