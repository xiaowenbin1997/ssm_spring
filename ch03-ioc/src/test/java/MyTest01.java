import domain.SysUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyTest01 {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("app01.xml");
        UserService userService = (UserService)ac.getBean("userService");
        SysUser sysUser = new SysUser("lisi",30);
        userService.addUser(sysUser);
    }
}
