package spring.ioc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import spring.SpringApplication;

import javax.annotation.Resource;


/**
 * Copyright(C), 2020 - 2023, 小码教育
 *
 * @Date: 2023/5/5 22:28
 * @Description:
 * @Author: mawb<mawb @ xiaoma.cn>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringApplication.class})
class HiTest {

    @Resource
    ApplicationContext applicationContext;

    @Resource
    BeanFactory beanFactory;

/*
    */
/**
     * 从classpath下加载xml文件
     *//*

    @Resource
    ClassPathXmlApplicationContext classPathXmlApplicationContext;

    */
/**
     * 从注解加载
     *//*

    @Resource
    AnnotationConfigApplicationContext annotationConfigApplicationContext;
*/

    @Test
    public void testHi() {
        Hi hi = applicationContext.getBean("hi", Hi.class);
        String s = hi.sayHi();
        System.out.println(s);
    }

    @Test
    public void testXmlBean() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        XmlBean xmlBean = classPathXmlApplicationContext.getBean("xmlBean", XmlBean.class);
        System.out.println(xmlBean.getName());
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
    }
}