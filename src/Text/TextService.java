package Text;

import One.Dao.UserDao;
import One.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextService {
    @Test
   public void text1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
        UserService userservice = context.getBean("uuuuuus", UserService.class);
        System.out.println(userservice);
        userservice.add();
    }
    @Test
    public void text2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao);
        userDao.add();
    }
}
