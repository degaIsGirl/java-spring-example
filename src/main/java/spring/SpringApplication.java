package spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Copyright(C), 2020 - 2023, 小码教育
 *
 * @Date: 2023/5/5 22:26
 * @Description:
 * @Author: mawb<mawb @ xiaoma.cn>
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableAsync
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}
