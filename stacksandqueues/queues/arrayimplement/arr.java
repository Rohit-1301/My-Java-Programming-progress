package stacksandqueues.queues.arrayimplement;

public class arr {
    public static class QueueA {
        int arr[] = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;

        void add(int x) {
            if (isFull()) {
                System.out.println("The queue is full");
            }
            if (front == -1) {
                front = 0;
                rear = 0;
                arr[0]=x;
            } else {
                arr[++rear] = x;
            }

            size++;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            } else {
                front++;
                size--;
                return arr[front - 1];
            }

        }

        int peek() {
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            } else {
                return arr[front];

            }
        }

        boolean isEmpty() {
            if (front == -1)
                return true;
            else
                return false;
        }

        boolean isFull() {
            if (rear == arr.length - 1)
                return true;
            else
                return false;
        }

        void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return size;
        }

    }

    public static void main(String[] args) {

        QueueA queue = new QueueA();
        queue.add(15);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("The elements in the queue are: ");
        queue.display();
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        
        queue.remove();
        System.out.println("The elements in the queue are: ");
        queue.display();

    }
}