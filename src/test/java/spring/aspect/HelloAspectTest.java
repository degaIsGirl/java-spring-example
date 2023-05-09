package spring.aspect;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.SpringApplication;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringApplication.class})
class HelloAspectTest {
    @Resource
    SpringHello springHello;

    @Test
    public void debug() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends SpringHello> aClass = this.springHello.getClass();
        Method debug = aClass.getDeclaredMethod("debug", String.class);
        debug.setAccessible(true);
        debug.invoke(this.springHello, "girl");
    }

    @Test
    public void testSayHello() {
        String girl = this.springHello.sayHello("girl");
    }
}