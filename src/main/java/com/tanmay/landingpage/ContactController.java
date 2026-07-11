package com.tanmay.landingpage;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("========== CONTACT FORM ==========");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        System.out.println("==================================");

        return "Form Submitted Successfully!";
    }
}