package One.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value = "kkk")
public class UserTwo implements User{

    @Override
    public void add() {
        System.out.println("UserTwo add.....");
    }
}
