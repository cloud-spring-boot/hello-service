package com.max.hello;

import com.max.hello.dto.MessageDto;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping(value = "hello")
public class HelloServiceMain {

    private static final Logger LOG = Logger.getLogger(HelloServiceMain.class);

    @RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
    public MessageDto hello(@PathVariable("firstName") String firstName,
                            @PathVariable("lastName") String lastName) {

        LOG.info("hello-service HELLO called");

        return new MessageDto(String.format("Hello %s %s", firstName, lastName));
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceMain.class, args);
    }

}
