package com.rowen.taco_cloud.data;

import com.rowen.taco_cloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {



}
