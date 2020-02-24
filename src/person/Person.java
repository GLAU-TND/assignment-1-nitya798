package person;

import java.util.LinkedList;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private LinkedList<Long> contactNumber;
    private String emailAddress;

    public Person(String firstName, String lastName, LinkedList<Long> contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public Person(String firstName, String lastName, LinkedList<Long> contactNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(LinkedList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
