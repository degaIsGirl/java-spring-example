package spring.threadlocal;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Async("asyncExecutor")
    public void asyncExecutor() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("in thread: " + Thread.currentThread().getName() + " start time: " + start + " ms");
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        System.out.println("in thread: " + Thread.currentThread().getName() + " end time: " + end + " ms , cost: " + (end - start));
    }
}
