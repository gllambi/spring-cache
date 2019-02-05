package hello;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Cacheable(value="helloCache", key="#name")
    public Greeting getGretting(String name){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
