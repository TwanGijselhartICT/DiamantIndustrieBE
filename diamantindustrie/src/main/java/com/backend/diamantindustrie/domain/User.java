package com.backend.diamantindustrie.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//Database table
@Entity(name = "user")
public class User {

    @Id
    private String username;
    private int age;
    private int collecteddiamonds;

    public User(String userName, int age, int collectedDiamonds) {
        username = userName;
        this.age = age;
        collecteddiamonds = collectedDiamonds;
    }


    public User(){

    }


    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        username = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCollectedDiamonds() {
        return collecteddiamonds;
    }

    public void setCollectedDiamonds(int collectedDiamonds) {
        collecteddiamonds = collectedDiamonds;
    }
}
