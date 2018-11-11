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
    public void test1() {
        User user = new User("SL1", "123", new Date());
        userRepository.save(user);
        System.out.println("save success");
    }

    @Test
    public void test2(){
        for (User user:userRepository.findAll()) {
            System.out.println(user);
        }
        System.out.println("search all success");
    }

    // find by id
    @Test
    public void test3(){
        System.out.println(userRepository.findOne(2));
        System.out.println("search one success");
    }

    @Test
    public void test4(){
        User user=new User("SL99","123",new Date());
        user.setId(10);
        userRepository.save(user);
        test3();
        System.out.println("update success");
    }

    // delete
    @Test
    public void test5(){
        userRepository.delete(1);
        test3();
        System.out.println("delete success");
    }
}
