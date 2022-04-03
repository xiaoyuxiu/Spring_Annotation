package One.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class UserDao implements User {
    public void add(){
        System.out.println("dao add......000000");
    }
}
