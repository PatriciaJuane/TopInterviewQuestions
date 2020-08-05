/*Merge two sorted listst*/
class LinkedList {
 
 //Definition for singly-linked list.
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  static ListNode head; // head of list

   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 1->2->4, 1->3->4
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while(true) {
            if(l1==null) {
                tail.next = l2;
                break;
            } else if(l2 == null) {
                tail.next = l1;
                break;
            }
            if(l1.val <= l2.val) { // 2->4
                ListNode aux = l1;
                l1 = l1.next; 
                aux.next = tail.next; // null
                tail.next = aux; // 1
            } else { // 3->4
                ListNode aux = l2;
                l2 = l2.next;
                aux.next = tail.next;
                tail.next = aux; // 1
            }
            tail = tail.next;
        }
        
        return dummy.next;
    }

  /* Inserts a new Node at front of the list. */
    public void addToTheLast(ListNode node) { 
      if (head == null) { 
          head = node; 
      } 
      else { 
          ListNode temp = head; 
          while (temp.next != null) 
              temp = temp.next; 
          temp.next = node; 
      } 
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
      
    }

}