package com.rowen.taco_cloud.data;

import com.rowen.taco_cloud.model.Ingredient;
import com.rowen.taco_cloud.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {



}
