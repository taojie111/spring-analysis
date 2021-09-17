package base.aop;

import base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author taojie
 */
public class CoreTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-core-test.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.send();
        context.close();
    }

}
