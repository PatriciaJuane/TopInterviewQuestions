import java.util.*;

/*Palindrome Linked List*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

  public boolean isPalindrome(ListNode head) {
        ListNode aux = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(aux!=null) {
            stack.push(aux.val);
            aux = aux.next;
        }
        
        while(head != null) {
            int i = stack.pop();
            
            if(i == head.val) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        
        return isPalindrome;
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
  
        System.out.println(llist.isPalindrome(head)); // false
    }

}