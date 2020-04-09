package com.github.lansheng228.consumer.controller;

import com.github.lansheng228.consumer.service.FallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service-consumer")
public class FallbackController {

  @Autowired
  private FallbackService fallbackService;

  @RequestMapping("/fallback")
  public String fallback() {
    return fallbackService.fallback();
  }
}

