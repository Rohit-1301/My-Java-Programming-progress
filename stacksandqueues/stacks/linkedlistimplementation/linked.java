package stacksandqueues.stacks.linkedlistimplementation;

public class linked {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            else{
                Node temp=head;
                head=head.next;
                size--;
                return temp.val;
            }
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            else{
                return head.val;
            }
        }
        int size(){
            return size;
        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.val+" ");
            
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
         void displayrev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
             }
        }
        
        
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            else{
                return false;
            }
        }
        int capacity(){
            return size;
        }
    
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("the stack which I created using a linked list is: ");
        st.display();
        System.out.println("the stack which I implemented using linked list in a reverse order is");
        st.displayrev();
        System.out.println();
        System.out.println("the size of the stack is: "+st.size());
        System.out.println("the element which is at the top of the stack is: "+st.peek());
        System.out.println("the elemnt which is pop from the stack is: "+st.pop());
        System.out.println(st.isEmpty());
    }
}
