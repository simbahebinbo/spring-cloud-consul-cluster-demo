package com.github.lansheng228.producer.controller;

import com.github.lansheng228.producer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/service-producer/user")
public class UserController {

  @Autowired
  private UserService userService;


  @GetMapping("/description")
  public Mono<String> description() {
    return Mono.just(userService.description());
  }

  @GetMapping("/author")
  public Mono<String> author() {
    return Mono.just(userService.author());
  }

  @GetMapping("/student/intro")
  public Mono<String> studentIntro() {
    return Mono.just(userService.studentIntro());
  }

  @GetMapping("/teacher/intro")
  public Mono<String> teacherIntro() {
    return Mono.just(userService.teacherIntro());
  }
}
