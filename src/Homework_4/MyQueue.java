package Homework_4;

public class MyQueue {
    private final int maxSize;
    private final Person[] queue;
    private int front;
    private int rear;
    private int items;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new Person[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public void insert(Person element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = element;
        items++;
    }

    public Person remove() {
        Person temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        items--;
        return temp;
    }

    public Person peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return items == 0;
    }

    public boolean isFull() {
        return items == maxSize;
    }

    public int size() {
        return items;
    }
}
