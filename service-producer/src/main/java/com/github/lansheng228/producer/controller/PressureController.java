package com.github.lansheng228.producer.controller;

import java.util.Map;

import com.github.lansheng228.producer.service.PressureService;
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
public class PressureController {

  @Autowired
  private PressureService pressureService;

  @PostMapping("/post-pressure")
  public Mono<String> postPressure(
      @RequestParam(value = "delay") long delay,
      @RequestParam(value = "length") int length,
      @RequestParam(value = "name", defaultValue = "lansheng228") String name,
      @RequestBody Map<Object, Object> payload) {

    return Mono.just(pressureService.postPressure(delay, length, name, payload));
  }

  @GetMapping("/get-pressure")
  public Mono<String> getPressure(
      @RequestParam(value = "delay") long delay,
      @RequestParam(value = "length") int length,
      @RequestParam(value = "name", defaultValue = "lansheng228") String name) {

    return Mono.just(pressureService.getPressure(delay, length, name));
  }
}
