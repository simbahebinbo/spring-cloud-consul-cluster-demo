package com.github.lansheng228.producer.service;


import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HiServiceImpl implements HiService {

  @Override
  public String postHi(String name, Map<Object, Object> payload) {
    log.info("post请求。参数：name:" + name);
    log.info("post请求。参数：payload:" + payload);
    return "webflux post hi。 " + "参数：name:" + name + " 参数：payload:" + payload;
  }

  @Override
  public String getHi(String name) {
    log.info("get请求。参数：name:" + name);
    return "webflux get hi。 " + "参数：name:" + name;
  }
}


