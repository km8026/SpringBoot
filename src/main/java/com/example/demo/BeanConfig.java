package com.example.demo;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.component.ImageUtil;

@Configuration
// @ComponentScan(basePackages = "com.example.demo.component")
public class BeanConfig {
  @Bean
  public ImageUtil imageUtil(){
    return new ImageUtil();
  }
  @Bean
  public Game game(){
    return new Game();
  }
  @Bean
  public String bean1() {
    return new String("Bean 1");
  }
}
