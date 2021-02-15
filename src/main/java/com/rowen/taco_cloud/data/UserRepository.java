package com.rowen.taco_cloud.data;

import com.rowen.taco_cloud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
