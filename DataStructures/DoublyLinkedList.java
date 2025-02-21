package DataStructures;

class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(data + " added to list");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println(data + " removed from list");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(data + " not found in list");
        } else {
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
            System.out.println(data + " removed from list");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.delete(20);
        list.display();
        list.delete(40);
    }
}
