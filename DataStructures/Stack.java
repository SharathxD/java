package DataStructures;
class Stack {
    private int[] stack;
    private int top;

    public Stack() {
        stack = new int[10];
        top = -1;
    }

    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = data;
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = stack[top];
        top--;
        System.out.println(data + " popped from stack");
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
