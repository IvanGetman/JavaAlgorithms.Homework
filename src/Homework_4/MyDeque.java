package Homework_4;

public class MyDeque {
    private final int maxSize;
    private final Person[] deque;
    private int front;
    private int rear;
    private int items;

    public MyDeque(int maxSize) {
        this.maxSize = maxSize;
        this.deque = new Person[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public void addFirst(Person element) {
        if (front == 0) {
            front = maxSize;
        }
        deque[--front] = element;
        items++;
    }

    public void addLast(Person element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        deque[++rear] = element;
        items++;
    }

    public Person removeFirst() {
        Person temp = deque[front++];
        if (front == maxSize) {
            front = 0;
        }
        items--;
        return temp;
    }

    public Person removeLast() {
        Person temp = deque[rear--];
        if (rear == -1) {
            rear = maxSize - 1;
        }
        items--;
        return temp;
    }

    public Person peekFirst() {
        return deque[front];
    }

    public Person peekLast() {
        return deque[rear];
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
