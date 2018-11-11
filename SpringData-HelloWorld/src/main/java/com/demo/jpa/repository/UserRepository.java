package com.demo.jpa.repository;
import com.demo.jpa.domain.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Integer> {

    public void save(User user);

    public User findByName(String name);
}