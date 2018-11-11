package com.demo.jpa.repository;
import com.demo.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Integer> {

    public void save(User user);
}