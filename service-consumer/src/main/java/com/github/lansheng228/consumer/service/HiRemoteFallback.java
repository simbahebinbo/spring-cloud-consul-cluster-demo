package com.github.lansheng228.consumer.service;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HiRemoteFallback implements HiRemote {

  @Override
  public String postHi(String name, Map<Object, Object> payload) {
    return "fallback postHi";
  }

  @Override
  public String getHi(String name) {
    return "fallback getHi";
  }
}
