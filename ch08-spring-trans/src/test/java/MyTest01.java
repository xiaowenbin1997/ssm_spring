import org.example.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void myTest01() {
        String config = "app01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService serviceImpl = (BuyGoodsService) ac.getBean("buyServiceImpl");
        serviceImpl.buy(1,3000);
    }
}
