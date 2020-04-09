package com.github.lansheng228.consumer.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "${service.producer.name}-${spring.profiles.active}",
    contextId = "HiRemote",
    path = "/service-producer",
    fallback = HiRemoteFallback.class)
public interface HiRemote {

  @PostMapping("/post-hi")
  String postHi(@RequestParam(value = "name", defaultValue = "lansheng228") String name,
      @RequestBody Map<Object, Object> payload);

  @GetMapping("/get-hi")
  String getHi(@RequestParam(value = "name", defaultValue = "lansheng228") String name);
}
