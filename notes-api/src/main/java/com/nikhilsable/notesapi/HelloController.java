package com.nikhilsable.notesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
        public String hi() {
        return "Hello World";
        }

    @GetMapping("/hey")
    public String hey() {
        return "Hello";
    }

    @GetMapping("/contact")
    public String sayContact() {
        return "Contact";
    }
}
