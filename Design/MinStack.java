class MinStack {
    
    class Node {
        
        int val;
        int min;
        Node next;
        
        public Node(int val, int min) {
            this.val = val;
            this.min = min;
            this.next = null;
        }
    }
    
    Node top;
 
    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(top==null) {
            top = new Node(x,x);
        } else {
            Node n = new Node(x, Math.min(x, Math.min(x,top.min)));
            n.next = top;
            top = n;
        }    
    }
    
    public void pop() { // remove top node
        if(top == null) {
            return;
        }
        Node temp = top.next;
        top.next = null;
        top = temp;
    }
    
    public int top() {
        if(top==null) {
            return -1;
        }
        return top.val;
    }
    
    public int getMin() {
        if(top == null) {
            return -1;
        }
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */