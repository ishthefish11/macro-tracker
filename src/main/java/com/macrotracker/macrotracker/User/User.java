package com.macrotracker.macrotracker.User;

import com.macrotracker.macrotracker.Food.Food;
import jakarta.persistence.*;

import java.util.HashMap;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userId;
    private String username;
    private HashMap<String, Double> macroGoals;
    private List<Food> foods;

    public User(String username) {
        this.username = username;
    }

    public User(String username, Long userId) { // for foodService, if food needs to be created with particular userId
        this.username = username;
        this.userId = userId;
    }

    public long getId() {
        return userId;
    }
}
