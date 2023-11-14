package com.macrotracker.macrotracker.Food;

import com.macrotracker.macrotracker.User.User;
import jakarta.persistence.*;

@Entity
public class Food {
    @Id
    private Long foodId;
    private String name;
    private double[] nutrients = new double[3]; // index 0: protein | index 1: carbs | index 2: fats
    @ManyToOne
    private User user;

    public Food(String name, User user) {
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

    public double[] getNutrients() {
        return nutrients;
    }

    public void setNutrients(double[] nutrients) {
        this.nutrients = nutrients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}