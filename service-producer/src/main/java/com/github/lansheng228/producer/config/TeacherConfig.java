package com.github.lansheng228.producer.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@ConfigurationProperties(prefix = "teacher")
public class TeacherConfig {

  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String course;
}
