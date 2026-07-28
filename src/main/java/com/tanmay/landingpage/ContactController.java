package com.tanmay.landingpage;

import com.tanmay.landingpage.entity.Contact;
import com.tanmay.landingpage.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    @ResponseBody
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        contactService.saveContact(contact);

        return "Form Submitted Successfully!";
    }
}