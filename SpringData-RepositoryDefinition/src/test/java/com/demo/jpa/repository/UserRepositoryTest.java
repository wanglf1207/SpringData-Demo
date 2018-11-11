package com.demo.jpa.repository;

import com.demo.jpa.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testFindByName() {

        User user = userRepository.findByName("wanglf");
        System.out.println("id = " + user.getId() + "  name = " + user.getName());
    }
}
