package com.macrotracker.macrotracker.Food;

import com.macrotracker.macrotracker.User.User;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long foodId;
    private String name;
    private List<Double> nutrients; // index 0: protein | index 1: carbs | index 2: fats
    @JdbcTypeCode(SqlTypes.JSON)
    @ManyToOne
    private User user;

    public Food(String name, Long userId) {
        this.name = name;
        this.user = new User("", userId);
        // add method for retrieving nutrients later when you implement the api
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Double> nutrients) {
        this.nutrients = nutrients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}