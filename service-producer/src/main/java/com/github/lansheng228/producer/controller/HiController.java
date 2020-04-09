package com.github.lansheng228.producer.controller;

import java.util.Map;

import com.github.lansheng228.producer.service.HiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/service-producer")
public class HiController {

  @Autowired
  private HiService hiService;

  @PostMapping("/post-hi")
  public Mono<String> postHi(@RequestParam(value = "name", defaultValue = "lansheng228") String name,
      @RequestBody Map<Object, Object> payload) {
    return Mono.just(hiService.postHi(name, payload));
  }

  @GetMapping("/get-hi")
  public Mono<String> getHi(@RequestParam(value = "name", defaultValue = "lansheng228") String name) {
    return Mono.just(hiService.getHi(name));
  }
}
