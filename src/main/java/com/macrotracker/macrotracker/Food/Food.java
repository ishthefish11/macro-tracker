package com.macrotracker.macrotracker.Food;

import com.macrotracker.macrotracker.User.User;
import jakarta.persistence.*;

import java.util.Random;

@Entity
public class Food {
    @Id
    private Long foodId;
    private String name;
    @ManyToOne
    private User user;

    public Food(String name, User user) {
        this.foodId = new Random().nextLong(100000000);
        this.name = name;
        this.user = user;
        // add method for retrieving nutrients later when you implement the api
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}