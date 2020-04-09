package com.github.lansheng228.consumer.controller;

import com.github.lansheng228.consumer.service.ServiceProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-consumer")
public class ServiceProducerController {

  @Autowired
  private ServiceProducerService serviceProducerService;

  @PostMapping("/post-hi")
  public String postHi() {
    return serviceProducerService.postHi();
  }

  @GetMapping("/get-hi")
  public String getHi() {
    return serviceProducerService.getHi();
  }
}
