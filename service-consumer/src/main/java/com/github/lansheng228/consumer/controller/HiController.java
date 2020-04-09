package com.github.lansheng228.consumer.controller;

import com.github.lansheng228.consumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-consumer")
public class HiController {

  @Autowired
  private HiService hiService;

  @GetMapping("/hi")
  public String hi(@RequestParam(value = "name", defaultValue = "lansheng228") String name) {
    return hiService.hi(name);
  }
}
