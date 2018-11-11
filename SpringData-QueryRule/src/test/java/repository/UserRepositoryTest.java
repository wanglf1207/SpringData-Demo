package repository;

import com.demo.jpa.domain.User;
import com.demo.jpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


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

    @Test
    public void testFindById() {
        User user = userRepository.findById(2);
        System.out.println(user.toString());
    }

    @Test
    public void testFindByNameAndPassword() {
        User user = userRepository.findByNameAndPassword("wangyuehan","123456");
        System.out.println(user.toString());
    }

    @Test
    public void testFindByNameOrAge() {
        List<User> userList = userRepository.findByNameOrAge("wanglf",3);

        for(User user : userList) {
            System.out.println(user.toString());
        }
    }
}
