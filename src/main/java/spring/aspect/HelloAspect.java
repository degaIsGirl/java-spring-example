package spring.aspect;

import lombok.With;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

/**
 * Copyright(C), 2020 - 2023, 小码教育
 *
 * @Date: 2023/5/7 11:37
 * @Description:
 * @Author: mawb<mawb @ xiaoma.cn>
 */
@Component
@Aspect
public class HelloAspect {
    //<访问修饰符号> 返回类型 报名名称.类名.方法名(参数) =》 没有出现()表示就是到类级别的
    //@Pointcut("execution(protected String spring.aspect.SpringHello.*(..))")

    //方法上满足指定注解将会生效
    @Pointcut("@annotation(spring.annotions.Mwb)")

    //类上满足指定的注解将会生效
    //@Pointcut("@within(org.springframework.web.bind.annotation.RestController)")

    //基于特定的bean name将会生效
    //@Pointcut("bean(indexController)")
    //beanName同样支持通配符匹配
    //@Pointcut("bean(*Controller)")
    public void helloPointCut() {
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint 连接点, 切入点是链接点的集合, 在spring中连接点是满足切入点的特点方法
     * @return
     * @throws Throwable
     */
    @Around("helloPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("around return" + proceed);
        System.out.println("around after");
        return proceed;
    }

    @Before(value = "helloPointCut())")
    public void before() {
        System.out.println("before");
    }

    @After("helloPointCut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning(pointcut = "helloPointCut()", returning = "res")
    public void afterReturning(String res) {
        System.out.println("afterReturning " + res);
    }

    @AfterThrowing(pointcut = "helloPointCut()", throwing = "e")
    public void afterThrowing(Exception e) {
        System.out.println("afterThrowing " + e.getMessage());
    }
}
