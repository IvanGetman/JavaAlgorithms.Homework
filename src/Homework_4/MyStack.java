package Homework_4;

public class MyStack {
    private final int maxSize;
    private final Person[] stack;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Person[this.maxSize];
        this.top = -1;
    }

    public void push(Person element) {
        this.stack[++this.top] = element;
    }

    public Person pop() {
        return this.stack[this.top--];
    }

    public Person peek() {
        return this.stack[this.top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }
}
