package com.github.lansheng228.consumer.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HiServiceImpl implements HiService {

  @Override
  public String hi(String name) {
    log.info("参数：name:" + name);
    return "hi " + name;
  }
}


