import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.jpa.domain.User;
import com.demo.jpa.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User("wanglf", "123456", new Date());
        userRepository.save(user);
        System.out.println("save success");
    }
}
