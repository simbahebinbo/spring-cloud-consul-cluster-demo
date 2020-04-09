package com.github.lansheng228.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRemoteFallback implements UserRemote {

  @Override
  public String author() {
    return "fallback author";
  }

  @Override
  public String description() {
    return "fallback description";
  }

  @Override
  public String studentIntro() {
    return "fallback studentIntro";
  }

  @Override
  public String teacherIntro() {
    return "fallback teacherIntro";
  }
}
