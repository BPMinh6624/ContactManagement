/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactmanager.Repository;

import com.mycompany.contactmanager.Model.Contact;
import java.util.ArrayList;

/**
 *
 * @author tuanh
 */

public interface IContactRepository {
    void createContact(ArrayList<Contact> contacts);
    void printAllContact(ArrayList<Contact> contacts);
    void deleteContactd(ArrayList<Contact> contacts);
}

