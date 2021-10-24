package com.tan.myjavarecordexample.spring.spring;

import com.tan.myjavarecordexample.spring.config.CommonConfig;
import com.tan.myjavarecordexample.spring.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {CommonConfig.class, WebConfig.class})
public class MyJavaRecordExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyJavaRecordExampleApplication.class, args);
  }

}
