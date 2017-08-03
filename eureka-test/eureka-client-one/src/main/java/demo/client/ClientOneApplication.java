package demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by javen on 2017/7/22.
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientOneApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ClientOneApplication.class, args);
    }
}
