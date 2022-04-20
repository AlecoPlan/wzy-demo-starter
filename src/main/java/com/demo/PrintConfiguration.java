package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzy
 * @date 2022/4/20 17:31
 */
@Configuration
public class PrintConfiguration {

    @Bean
    public PrintProcess printProcess() {
        return new PrintProcess();
    }
}