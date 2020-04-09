package com.github.lansheng228.producer.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello() {
    return "hello";
  }
}


