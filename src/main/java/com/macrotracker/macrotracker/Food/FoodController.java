package com.macrotracker.macrotracker.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.macrotracker.macrotracker.User.User;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/users/{id}/foods")
    public List<Food> getAllFoods(@PathVariable String id) {
        return foodService.getAllFoods(Long.parseLong(id));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/{id}")
    public void addFood(@RequestBody Food food, @PathVariable String id) {
        food.setUser(new User("", Long.parseLong(id)));
        foodService.addFood(food);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable String id) {
        foodService.deleteFood(Long.parseLong(id));
    }
}
