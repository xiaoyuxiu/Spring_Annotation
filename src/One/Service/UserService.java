package One.Service;

import One.Dao.User;
import One.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//value属性可以省略保修额，默认值时类名，首字母小写
@Component(value = "uuuuuus") //相当于<bean id="uuuuuuus">
public class UserService {
    //@Autowired
    //@Qualifier(value = "kkk")
            //一个接口多个实现类

    //Resource为java包少注入
    @Resource(name = "kkk")
    User a;
    @Value(value = "abc")
    private  String name;
    public void add(){
        System.out.println("service add.........");
        a.add();
        System.out.println(name);
    }
}
