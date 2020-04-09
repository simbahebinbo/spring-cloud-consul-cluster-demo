package com.github.lansheng228.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;


@Slf4j
class HiControllerTest extends BaseControllerTest {

  @Autowired
  private TestRestTemplate restTemplate;

  private static final String url = "/service-consumer/hi";

  @Test
  void test_hi() {
    ResponseEntity<String> responseEntity = restTemplate
        .getForEntity(url, String.class, String.class);
    String ret = responseEntity.getBody();
    log.info("ret:\t" + ret);
    Assertions.assertEquals("hi lansheng228", ret);
  }
}

