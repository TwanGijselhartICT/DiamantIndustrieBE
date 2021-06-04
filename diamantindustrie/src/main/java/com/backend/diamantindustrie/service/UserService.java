package com.backend.diamantindustrie.service;

import com.backend.diamantindustrie.domain.User;
import com.backend.diamantindustrie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String InsertUserIntoDB(String userName, int age){


        User user = new User(userName, age, 0);

        userRepository.save(user);
        return "Username: " + userName + " met leeftijd: " + age + " is succesvol toegevoegd aan de database!";
    }

    public void CheckIfUserExists(String userName){

    }

}
