package com.callcenter.dao;


import com.callcenter.entities.Duration;
import com.callcenter.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findByDuration(String sum);

    @Query(value = "select * from sample_data", nativeQuery = true)
    public List<User> getStarthr(String value);
}
