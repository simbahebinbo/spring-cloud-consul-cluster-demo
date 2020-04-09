package com.github.lansheng228.producer.controller;

import com.github.lansheng228.producer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/service-producer")
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/hello")
  public Mono<String> hello() {
    return Mono.just(helloService.hello());
  }
}
