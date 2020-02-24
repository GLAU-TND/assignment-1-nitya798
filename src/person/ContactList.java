package person;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ContactList {
    Scanner sc = new Scanner(System.in);
    private LinkedList<Person> list = new LinkedList<>();
    private String emailAddress;
    private Person person;
    private LinkedList<Long> contactNumber;

    public void addContact() {
        System.out.println("For adding new Contact please enter the deatails");
        System.out.println("Enter firstName: ");
        String firstName = sc.next();
        System.out.println("Enter lastName: ");
        String lastName = sc.next();
        System.out.println("enter the concat number: ");
        contactNumber = new LinkedList<>();
        contactNumber.add(sc.nextLong());
        addContactNumber();
        addemailAddress();
        Person person = new Person(firstName, lastName, contactNumber, emailAddress);
        list.add(person);
        Collections.sort(list);

    }

    private void addContactNumber() {
        System.out.println("do you wanna to add another contact number? y/n");
        String response = sc.next();
        if (response.equals("y")) {
            contactNumber.add(sc.nextLong());
            addContactNumber();
        }
    }

    private void addemailAddress() {
        System.out.println("do you wanna add email address? y/n: ");
        String response = sc.next();
        if (response.equals("y")) {
            emailAddress = sc.next();
        } else {
            emailAddress = "-";
        }
    }


    public void searchContact() {
        System.out.println("You could search for a contact from their first names: ");
        String name = sc.next();
        int c = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equals(name)) {
                c++;
            }

        }
        if (c > 0) {
            System.out.println(c + " matches are found");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getFirstName().equals(name)) {
                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("FirstName: " + list.get(i).getFirstName() + " LastName: " + list.get(i).getLastName());
                    System.out.println("contactno.: ");
                    for (int j = 0; j < contactNumber.size(); j++) {
                        System.out.println(list.get(i).getContactNumber().get(j) + " ");
                    }
                    System.out.println();
                    System.out.println("EmailAddress: " + list.get(i).getEmailAddress());
                    System.out.println("-------- * -------- * -------- * --------");
                }
            }

        } else
            System.out.println("no match found");
    }


    public void deleteContact() {
        System.out.println("Here are all your contacts");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i).getFirstName() + " " + list.get(i).getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        int number = sc.nextInt();
        System.out.println(list.get(number - 1).getFirstName() + " 's contact deleted from your list ");
        list.remove(number - 1);
    }


    public void viewContactList() {
        System.out.println("---Here are all your contacts---");
        for (int i = 0; i < list.size(); i++) {

            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("FirstName: " + list.get(i).getFirstName() + " LastName: " + list.get(i).getLastName());
            System.out.println("contactno.: ");
            for (int j = 0; j < contactNumber.size(); j++) {
                System.out.println(list.get(i).getContactNumber().get(j) + " ");
            }
            System.out.println();
            System.out.println("EmailAddress: " + list.get(i).getEmailAddress());
            System.out.println("-------- * -------- * -------- * --------");

        }
    }
}
