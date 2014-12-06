package com.beaglescats.contactmanager.dao;

import java.util.List;

import com.beaglescats.contactmanager.domain.Contact;

public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}