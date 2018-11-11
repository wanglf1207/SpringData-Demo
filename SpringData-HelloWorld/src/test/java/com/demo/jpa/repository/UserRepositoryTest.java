package  com.demo.jpa.repository;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.jpa.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("wangyuehan");
        user.setAge(1);
        user.setBirthday(new Date());
        user.setPassword("123456");
        user.setPhoneNumber("18621922383");
        user.setEmail("wanglf1207@163.com");
        user.setAddress("中国上海浦东新区");
        user.setDescription("小受气包");
        userRepository.save(user);
        System.out.println("save success");
    }

    @Test
    public void testFindByName() {

        User user = userRepository.findByName("wanglf");
        System.out.println("id = " + user.getId() + "  name = " + user.getName());
    }
}
