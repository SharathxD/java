package DataStructures;

class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue() {
        queue = new int[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        size++;
        System.out.println(data + " added to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println(data + " removed from queue");
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
