package com.github.lansheng228.producer.service;


import com.github.lansheng228.producer.config.StudentConfig;
import com.github.lansheng228.producer.config.TeacherConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

  @Value("${description:example}")
  private String description;

  @Value("${author:example}")
  private String author;

  @Autowired
  private StudentConfig studentConfig;

  @Autowired
  private TeacherConfig teacherConfig;

  @Override
  public String description() {
    log.info("描述:\t" + description);
    return description;
  }

  @Override
  public String author() {
    log.info("作者:\t" + author);
    return author;
  }

  @Override
  public String studentIntro() {
    log.info("学生信息:\t" + "姓名:" + studentConfig.getName() + "，年龄:" + studentConfig.getAge());
    return "姓名:" + studentConfig.getName() + "，年龄:" + studentConfig.getAge();
  }

  @Override
  public String teacherIntro() {
    log.info("老师信息:\t" + "姓名:" + teacherConfig.getName() + "，课程:" + teacherConfig.getCourse());
    return "姓名:" + teacherConfig.getName() + "，课程:" + teacherConfig.getCourse();
  }
}


