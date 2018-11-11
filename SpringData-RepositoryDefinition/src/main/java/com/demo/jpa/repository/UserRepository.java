package com.demo.jpa.repository;
import com.demo.jpa.domain.User;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = User.class, idClass = Integer.class)
public interface UserRepository /*extends Repository<User,Integer>*/ {

    public User findByName(String name);
}