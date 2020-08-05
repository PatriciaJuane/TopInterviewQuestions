import java.util.*;

/*Linked List has a Cycle*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

  public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
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
  
        System.out.println(llist.hasCycle(head)); // false
    }

}