package demo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by javen on 2017/7/22.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("demo.*.api")
public class CustomerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
