/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactmanager.Repository;

import com.mycompany.contactmanager.DataAccess.ContactDao;
import com.mycompany.contactmanager.Model.Contact;
import java.util.ArrayList;


public class ContactRepository implements IContactRepository{
private ArrayList<Contact> contacts;

    @Override
    public void createContact(ArrayList<Contact> contacts) {
        ContactDao.Instance().createContact(contacts);
    }

    @Override
    public void printAllContact(ArrayList<Contact> contacts) {
        ContactDao.Instance().printAllContact(contacts);
    }

    @Override
    public void deleteContactd(ArrayList<Contact> contacts) {
        ContactDao.Instance().deleteContactd(contacts);
    }

    
}
