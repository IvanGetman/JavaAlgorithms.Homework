package Homework_4;

import java.util.PriorityQueue;

public class Homework_4 {
    public static void main(String[] args) {
        long startTime;
        long finishTime;
        //Задание 4.1
        MyStack personMyStack = new MyStack(5);
        personMyStack.push(new Person("Иван", "Иванов"));
        personMyStack.push(new Person("Сергей", "Иванов"));
        personMyStack.push(new Person("Р2Д2", "Иванов"));
        personMyStack.push(new Person("Иван", "Сергеев"));
        startTime = System.nanoTime();
        personMyStack.push(new Person("Сергей", "Сергеев"));
        finishTime = System.nanoTime();
        System.out.println("Время метода .push = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(personMyStack.isFull()); //true
        finishTime = System.nanoTime();
        System.out.println("Время метода .isFull = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(personMyStack.isEmpty()); //false
        finishTime = System.nanoTime();
        System.out.println("Время метода .isEmpty = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(personMyStack.peek());
        finishTime = System.nanoTime();
        System.out.println("Время метода .peek = " + (finishTime - startTime));
        System.out.println(personMyStack.isFull()); //true
        startTime = System.nanoTime();
        System.out.println(personMyStack.pop());
        finishTime = System.nanoTime();
        System.out.println("Время метода .pop = " + (finishTime - startTime));
        System.out.println(personMyStack.isFull()); //false
        System.out.println(personMyStack.pop());
        System.out.println(personMyStack.pop());
        System.out.println(personMyStack.pop());
        System.out.println(personMyStack.pop());
        System.out.println(personMyStack.isEmpty()); //true

        //Задание 4.2
        MyQueue myQueue = new MyQueue(5);
        myQueue.insert(new Person("Иван", "Иванов"));
        myQueue.insert(new Person("Сергей", "Иванов"));
        myQueue.insert(new Person("Р2Д2", "Иванов"));
        myQueue.insert(new Person("Иван", "Сергеев"));
        startTime = System.nanoTime();
        myQueue.insert(new Person("Сергей", "Сергеев"));
        finishTime = System.nanoTime();
        System.out.println("Время метода .insert = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myQueue.size()); //5
        finishTime = System.nanoTime();
        System.out.println("Время метода .size = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myQueue.isFull()); //true
        finishTime = System.nanoTime();
        System.out.println("Время метода .isFull = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myQueue.isEmpty()); //false
        finishTime = System.nanoTime();
        System.out.println("Время метода .isEmpty = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myQueue.remove());
        finishTime = System.nanoTime();
        System.out.println("Время метода .remove = " + (finishTime - startTime));
        System.out.println(myQueue.size()); //4
        startTime = System.nanoTime();
        System.out.println(myQueue.peek());
        finishTime = System.nanoTime();
        System.out.println("Время метода .peek = " + (finishTime - startTime));
        System.out.println(myQueue.size()); //4
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.isFull()); //false
        System.out.println(myQueue.isEmpty()); //true

        //Задание 4.3
        MyDeque myDeque = new MyDeque(5);
        myDeque.addFirst(new Person("Иван", "Иванов"));
        myDeque.addFirst(new Person("Сергей", "Иванов"));
        myDeque.addFirst(new Person("Р2Д2", "Иванов"));
        startTime = System.nanoTime();
        myDeque.addLast(new Person("Иван", "Сергеев"));
        finishTime = System.nanoTime();
        System.out.println("Время метода .addLast = " + (finishTime - startTime));
        startTime = System.nanoTime();
        myDeque.addFirst(new Person("Сергей", "Сергеев"));
        finishTime = System.nanoTime();
        System.out.println("Время метода .addFirst = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.size());
        finishTime = System.nanoTime();
        System.out.println("Время метода .size = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.isFull());
        finishTime = System.nanoTime();
        System.out.println("Время метода .isFull = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.isEmpty());
        finishTime = System.nanoTime();
        System.out.println("Время метода .isEmpty = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.peekLast());
        finishTime = System.nanoTime();
        System.out.println("Время метода .peekLast = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.removeFirst());
        finishTime = System.nanoTime();
        System.out.println("Время метода .removeFirst = " + (finishTime - startTime));
        startTime = System.nanoTime();
        System.out.println(myDeque.removeLast());
        finishTime = System.nanoTime();
        System.out.println("Время метода .removeLast = " + (finishTime - startTime));
        System.out.println(myDeque.peekLast());

        //Задание 4.4
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        startTime = System.nanoTime();
        priorityQueue.add(9);
        finishTime = System.nanoTime();
        System.out.println("Время метода .add = " + (finishTime - startTime));
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(5);
        startTime = System.nanoTime();
        priorityQueue.remove();
        finishTime = System.nanoTime();
        System.out.println("Время метода .remove = " + (finishTime - startTime));

        //Задание 4.5
        //Надеюсь очереди и стэки достали тебя также как и меня
    }
}
