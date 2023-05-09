package spring.threadlocal;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "async.executor.thread")
@Data
public class AsyncExecutorProperty {
    //配置核心线程数
    private Integer corePoolSize;

    //配置最大线程数
    private Integer maxPoolSize;

    //配置队列大小
    private Integer queueCapacity;

    //配置线程池中的线程的名称前缀
    private String namePrefix;
}
