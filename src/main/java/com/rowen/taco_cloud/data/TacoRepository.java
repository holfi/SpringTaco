package com.rowen.taco_cloud.data;

import com.rowen.taco_cloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, String> {



}
