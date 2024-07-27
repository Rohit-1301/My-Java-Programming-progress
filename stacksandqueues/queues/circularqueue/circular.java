package stacksandqueues.queues.circularqueue;

public class circular {
    public static class Circle {
        int arr[] = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;

        void add(int x) throws Exception {
            if (size == arr.length) {
                throw new Exception("The queue is full");
            }
           else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = x;
            }  else if (rear < arr.length - 1) {
                
                arr[++rear] = x;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = x;
            }
            size++;
        }

        int remove() throws Exception {
            if (size == 0) {
                throw new Exception("The queue is empty");
            } 
            else {
                int val=arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        int peek() throws Exception {
            if (size == 0) {
                throw new Exception("The queue is empty");
            }
            else return arr[front];

        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean isfull() {
            if (size == 5) {
                return true;
            } else {
                return false;
            }
        }

        void display() {
            if (size == 0) {
                System.out.println("The queue is empty");
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(" ");
            } else  {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Circle c = new Circle();
        c.display();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c.size());
        c.display();
        c.remove();
        c.remove();
        c.remove();
        c.display();
        
        System.out.println(c.size());
        c.add(6);
        c.add(7);
        c.add(8);
        
        System.out.println(c.size());
        c.display();
        for(int i=0;i<c.arr.length;i++){
            System.out.print(c.arr[i]+" ");
        }
    }
}
