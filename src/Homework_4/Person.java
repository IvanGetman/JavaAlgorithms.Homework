package Homework_4;

public class Person {
    public String firstname;
    public String lastName;

    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: " + firstname + " " + lastName;
    }
}
