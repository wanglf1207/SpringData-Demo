package com.demo.jpa.repository;
import com.demo.jpa.domain.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User,Integer> {

    /**
     *
     * @param name
     * @return
     */
    public User findByName(String name);

    /**
     *
     * @param id
     * @return
     */
    public User findById(Integer id);

    /**
     * AND关键字
     * @param name
     * @param password
     * @return
     */
    public User findByNameAndPassword(String name,String password);

    /**
     * OR 关键字演示
     * @param nama
     * @param age
     * @return
     */
    public List<User> findByNameOrAge(String nama, Integer age);

}