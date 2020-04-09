package com.github.lansheng228.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "${service.producer.name}-${spring.profiles.active}",
    contextId = "UserRemote",
    path = "/service-producer/user",
    fallback = UserRemoteFallback.class)
public interface UserRemote {

  @GetMapping("/author")
  String author();

  @GetMapping("/description")
  String description();

  @GetMapping("/student/intro")
  String studentIntro();

  @GetMapping("/teacher/intro")
  String teacherIntro();
}
