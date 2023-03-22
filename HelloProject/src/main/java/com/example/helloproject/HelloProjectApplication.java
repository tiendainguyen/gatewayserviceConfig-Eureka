package com.example.helloproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/api/v1/")
public class HelloProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloProjectApplication.class, args);
  }

  @GetMapping("/sayHi")
  public String sayHi() {
    return "hello " + "daint";
  }
}
