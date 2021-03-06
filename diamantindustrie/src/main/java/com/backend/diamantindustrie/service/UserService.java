package com.backend.diamantindustrie.service;

import com.backend.diamantindustrie.domain.User;
import com.backend.diamantindustrie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String InsertUserIntoDB(String userName, int age) {
        User user = new User(userName, age, 0);

        userRepository.save(user);
        return "Username: " + userName + " met leeftijd: " + age + " is succesvol toegevoegd aan de database!";
    }

    public String CheckIfUserAndAgeExists(String userName, int age) {
        String ValueToReturn;

        String dbUserName = userRepository.findByUserNameAndAge(userName, age);

        if (userRepository.findByUserNameAndAge(userName, age) != null) {
            if (userName.equalsIgnoreCase(dbUserName)) {
                ValueToReturn = "true";
            } else ValueToReturn = "false";
        } else ValueToReturn = "false";

        return (ValueToReturn);
    }

    public String UpdateDiamondsInDB(String userName, int age, int collectedDiamonds) {
        User user = new User(userName, age, collectedDiamonds);

        userRepository.save(user);
        return "Succesvol: " + collectedDiamonds + " bijgewerkt in de database!";
    }

    public String CheckDiamonds(String userName, int age) {

        return userRepository.findDiamonds(userName, age);
    }
}
