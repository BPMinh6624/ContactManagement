/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactmanager.Controller;

import com.mycompany.contactmanager.Model.Contact;
import com.mycompany.contactmanager.View.Menu;
import com.mycompany.contactmanager.Common.Library;
import com.mycompany.contactmanager.Repository.ContactRepository;
import com.mycompany.contactmanager.Repository.IContactRepository;

import java.util.ArrayList;


public class ContactManager extends Menu<String>{
    private IContactRepository contactRepository;
    static String[] mc = {"Add a contact", "Display all contacts", "Delete a contact", "Exit"};
    ArrayList<Contact> contacts = new ArrayList<>();
    
    private Library library;
    
    public ContactManager(Contact contact) {
        super("Contact Management Program", mc);
        library = new Library();
        contactRepository = new ContactRepository();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                contactRepository.createContact(contacts);
                break;
            case 2:
                contactRepository.printAllContact(contacts);
                break;
            case 3:
                contactRepository.deleteContactd(contacts);
                break;
            case 4:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
    
    
}
