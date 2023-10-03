/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contactmanager;
 
/**
 *
 * @author tuanh
 */
import com.mycompany.contactmanager.Controller.ContactManager;
import com.mycompany.contactmanager.Model.Contact;


public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        new ContactManager(contact).run();
    }
}
