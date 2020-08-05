/*Remove Nth node from End of List*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

  public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        
        ListNode first = dummyNode; // n
        ListNode second = dummyNode; // 0
        
        for(int i=1; i<= n+1; i++) {
            first = first.next; // until we reach position N
        }
        
        while(first!=null) { // we reach the end
            first = first.next;
            second = second.next; // nth from the end
        }
        
        second.next = second.next.next;
        return dummyNode.next; // remove the previous dummyNode.
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
  
        llist.removeNthFromEnd(head,2);
  
        System.out.println("\nLinked List after Deletion:"); 
        llist.printList(); 
    }

}