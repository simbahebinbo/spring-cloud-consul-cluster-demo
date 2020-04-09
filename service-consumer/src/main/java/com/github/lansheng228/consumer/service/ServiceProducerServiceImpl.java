package com.github.lansheng228.consumer.service;


import com.google.common.collect.ImmutableMap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ServiceProducerServiceImpl implements ServiceProducerService {

  @Autowired
  private HiRemote hiRemote;

  @Autowired
  private UserRemote userRemote;

  @Override
  public String postHi() {
    ImmutableMap<Object, Object> bodyParams = ImmutableMap.builder()
        .put("name", "binbo")
        .build();
    String name = "simba";
    return hiRemote.postHi(name, bodyParams);
  }

  @Override
  public String getHi() {
    String name = "simba";
    return hiRemote.getHi(name);
  }

  @Override
  public String author() {
    return userRemote.author();
  }

  @Override
  public String description() {
    return userRemote.description();
  }

  @Override
  public String studentIntro() {
    return userRemote.studentIntro();
  }

  @Override
  public String teacherIntro() {
    return userRemote.teacherIntro();
  }
}



