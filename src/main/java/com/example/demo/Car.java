package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Car {
  // 전역 변수를 가진 DTO
  int tire;
  String model;
  public void run() {
    System.out.println("Car run!!!");
  }
} 
