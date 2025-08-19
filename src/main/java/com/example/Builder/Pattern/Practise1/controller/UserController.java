package com.example.Builder.Pattern.Practise1.controller;

import com.example.Builder.Pattern.Practise1.model.Address;
import com.example.Builder.Pattern.Practise1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {

        Address address = new Address.AddressBuilder()
                .street(" b b ganguly street")
                .city("kolkata")
                .state("west bengal")
                .pincode(700012)
                .build();

    User user = new User.UserBuilder()
            .firstName("Saba")
            .lastName("Jannat")
            .age(28)
            .address(address)
            .build();

    return user;
}
}
