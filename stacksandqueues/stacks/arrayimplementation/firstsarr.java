package stacksandqueues.stacks.arrayimplementation;

public class firstsarr {
    public static class Stack{
       private int arr[]=new int[5];
       private int idx=0;
       void push(int x){
        if(isfull()){
            System.out.println("the stack is full");
            return;
        }
        arr[idx]=x;
        idx++;
       }
       int pop(){
        if(idx==0){
            System.out.println("stack is empty");
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
       }
       int peek(){
        if(idx==0){
            System.out.println("stack is empty");
        }
        return arr[idx-1];
       }
       int size(){
        if(idx==0){
            System.out.println("stack is empty");
        }
        return idx;
       }
       boolean isEmpty(){
           if(idx==0){
             return true;
            }
            else{
                return false;
       }
    }
       boolean isfull(){
           if(idx==arr.length)
               return true;
           
           else
               return false;
           
       }
       void display(){
           for(int i=0;i<idx;i++){
               System.out.print(arr[i]+" ");
           }
       }
       int capacity(){
        return arr.length;
       }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("the stack which I implement using an array is: ");
        st.display();
        System.out.println();
        System.out.println(st.isfull());
        System.out.println("the size of the stack is: "+ st.size());
        System.out.println("the element which is at the top at now is: "+st.peek());
        System.out.println("the elemnt which we pop from the stack is: "+st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.isfull());
        System.out.println("the size of the stack after we pop the element is: "+st.size());
        st.push(6);
        st.push(7);
        System.out.println("the capacity of the stack is: "+st.capacity());
    }
}
