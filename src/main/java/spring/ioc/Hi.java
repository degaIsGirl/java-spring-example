package spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Copyright(C), 2020 - 2023, 小码教育
 *
 * @Date: 2023/5/5 22:21
 * @Description:
 * @Author: mawb<mawb @ xiaoma.cn>
 */
@Component
public class Hi {
    public String sayHi() {
        return "Hi";
    }

    @PostConstruct
    public void init() {
        System.out.println("Hi init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Hi destroy");
    }
}
