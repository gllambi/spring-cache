package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:beans.xml"})
@EnableCaching
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
