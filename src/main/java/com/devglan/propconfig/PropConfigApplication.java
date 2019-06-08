package com.devglan.propconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PropConfigApplication extends SpringBootServletInitializer {

    private static Class<PropConfigApplication> applicationClass = PropConfigApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(PropConfigApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}