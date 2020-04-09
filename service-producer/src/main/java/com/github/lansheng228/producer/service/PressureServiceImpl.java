package com.github.lansheng228.producer.service;


import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PressureServiceImpl implements PressureService {

  @Override
  public String postPressure(long delay, int length, String name, Map<Object, Object> payload) {
    log.info("post请求。参数：name:" + name + "delay" + delay + "length" + length);
    log.info("post请求。参数：payload:" + payload);
    try {
      Thread.sleep(delay);
    } catch (Exception ignored) {
    }

    return "web post pressure。 " + "参数：name:" + name + "  参数：payload:" + payload + "   附加值: " + StringUtils.repeat("a", length);
  }

  @Override
  public String getPressure(long delay, int length, String name) {
    try {
      Thread.sleep(delay);
    } catch (Exception ignored) {
    }

    return "web get pressure " + "参数：name: " + name + "   附加值: " + StringUtils.repeat("a", length);
  }
}


