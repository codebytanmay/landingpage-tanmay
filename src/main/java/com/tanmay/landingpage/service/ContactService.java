package com.tanmay.landingpage.service;

import com.tanmay.landingpage.entity.Contact;
import com.tanmay.landingpage.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public Contact saveContact(Contact contact) {
        return repository.save(contact);
    }
}