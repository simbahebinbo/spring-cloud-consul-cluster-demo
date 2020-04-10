package com.github.lansheng228.consumer.controller;

import com.github.lansheng228.consumer.service.ServiceProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/service-consumer/user")
public class UserController {

  @Autowired
  private ServiceProducerService serviceProducerService;


  @GetMapping("/description")
  public String description() {
    return serviceProducerService.description();
  }

  @GetMapping("/author")
  public String author() {
    return serviceProducerService.author();
  }

  @GetMapping("/student/intro")
  public String studentIntro() {
    return serviceProducerService.studentIntro();
  }

  @GetMapping("/teacher/intro")
  public String teacherIntro() {
    return serviceProducerService.teacherIntro();
  }
}
