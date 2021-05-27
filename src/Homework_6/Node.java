package Homework_6;

import Homework_4.Person;

public class Node {
    public Node leftChild;
    public Node rightChild;
    public Person person;

    public Node(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Node" + person;
    }

    public void display() {
        System.out.println("Node" + person);
    }
}