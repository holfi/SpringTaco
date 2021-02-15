package com.rowen.taco_cloud.security;

import com.rowen.taco_cloud.model.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    public final String username;
    public final String password;
    public final String fullname;
    public final String street;
    public final String city;
    public final String state;
    public final String zip;
    public final String phoneNumber;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password),
                fullname, street, city, state, zip, phoneNumber);
    }

}
