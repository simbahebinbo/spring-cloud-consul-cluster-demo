package com.github.lansheng228.consumer.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FallbackServiceImpl implements FallbackService {

  @Override
  public String fallback() {
    return "fallback";
  }
}


