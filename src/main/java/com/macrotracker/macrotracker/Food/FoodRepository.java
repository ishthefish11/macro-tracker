package com.macrotracker.macrotracker.Food;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Long> {
    public List<Food> findByUserId(Long id);
}
