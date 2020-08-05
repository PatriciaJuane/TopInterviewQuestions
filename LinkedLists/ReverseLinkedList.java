/*Reverse Linked List*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

  public ListNode reverseList(ListNode head) {
       // 1 -> 2 -> 3 -> 4 -> 5 -> null
       // 1 <- 2 <- 3 <- 4 <- 5 <- null
        ListNode prev = null;
        ListNode curr = head; // 1
        
        while(curr != null) { // while we dont reach the end
            ListNode aux = curr.next; // 4
            curr.next = prev; // 2
            prev = curr; // 3
            curr = aux; // 4
        }  // 1 <- 2 <- 3 <- 4 ... <- 5 <- null
        return prev;
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
  
        llist.reverseList(head);
    }

}