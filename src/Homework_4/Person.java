package Homework_4;

public class Person {
    public int id;
    public String firstname;
    public String lastName;

    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public Person(int id, String firstname, String lastName) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: " + firstname + " " + lastName;
    }
}
