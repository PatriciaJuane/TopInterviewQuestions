/*Delete node in a linked list*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

    public void deleteNode(ListNode node) {
        node.val = node.next.val; 
        node.next = node.next.next;
    }

  /* Inserts a new Node at front of the list. */
    public void push(int new_data) { 
        ListNode new_node = new ListNode(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    /* This function prints contents of linked list starting from 
        the given node */
    public void printList() { 
        ListNode tnode = head; 
        while (tnode != null) { 
            System.out.print(tnode.val+" "); 
            tnode = tnode.next; 
        } 
    } 

    public static void main(String[] args) {
        LinkedList llist = new LinkedList(); 
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
        llist.deleteNode(head.next.next); // Delete node at position 3 
  
        System.out.println("\nLinked List after Deletion at position 3:"); 
        llist.printList(); 
    }

}