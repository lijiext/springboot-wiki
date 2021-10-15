package com.lijiext.wiki.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.lijiext.wiki")
@SpringBootApplication
public class WikiApplication {
    public static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("应用启动成功！");
        LOG.info("地址：\thttp://localhost:{}", environment.getProperty("server.port"));
    }

}
