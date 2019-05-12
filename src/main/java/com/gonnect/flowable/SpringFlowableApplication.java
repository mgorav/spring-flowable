package com.gonnect.flowable;

import org.flowable.engine.RuntimeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class SpringFlowableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFlowableApplication.class, args);
    }

    @Bean
    CommandLineRunner basics(final RuntimeService runtimeService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                runtimeService.startProcessInstanceByKey("waiter", Collections.singletonMap("customerId", (Object) 243L));
                runtimeService.startProcessInstanceByKey("data-navigator-flows", Collections.singletonMap("execution", "1"));
            }
        };
    }

}
