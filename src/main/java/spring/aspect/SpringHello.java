package spring.aspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.annotions.Mwb;

/**
 * Copyright(C), 2020 - 2023, 小码教育
 *
 * @Date: 2023/5/7 11:36
 * @Description:
 * @Author: mawb<mawb @ xiaoma.cn>
 */
@Service
public class SpringHello implements Hello{
    @Override
    @Mwb
    public String sayHello(String string) {
        return this.debug(string);
    }

    protected String debug(String res) {
        String data = "Hello " + res;
        System.out.println(data);
        return data;
    }
}
