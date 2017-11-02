package com.m2advertise.games.scratch.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.m2advertise.games.scratch")
public class FeignConfiguration {

}
