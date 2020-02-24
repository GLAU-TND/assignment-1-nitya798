package main;

import person.ContactList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactList obj = new ContactList();


        while (true) {
            System.out.println("Welcome to NITYA's Contact List App\n" +
                    "Press 1 to add a new contact\n" +

                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = sc.nextInt();
            if (choice == 1) {
                obj.addContact();
            } else if (choice == 2) {
                obj.viewContactList();
            } else if (choice == 3) {
                obj.searchContact();
            } else if (choice == 4) {
                obj.deleteContact();
            } else if (choice == 5) {
                break;
            }

        }
    }
}
