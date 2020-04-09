package com.github.lansheng228.producer.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;


@Slf4j
class HelloControllerTest extends BaseControllerTest {

  @Autowired
  private TestRestTemplate restTemplate;

  private static final String url = "/service-producer/hello";

  @Test
  void test_hello() {
    ResponseEntity<String> responseEntity = restTemplate
        .getForEntity(url, String.class, String.class);
    String ret = responseEntity.getBody();
    log.info("ret: " + ret);
    Assertions.assertEquals("hello", ret);
  }
}

