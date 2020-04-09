package com.github.lansheng228.consumer.job;

import com.github.lansheng228.consumer.service.ServiceProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class PressureJob {

  @Autowired
  private ServiceProducerService serviceProducerService;

  /**
   * 心跳更新。启动之后执行一次，之后每隔1秒执行一次
   */
  @Scheduled(fixedRate = 1_000)
  public void pressure() {
    log.info(serviceProducerService.postHi());
    log.info(serviceProducerService.getHi());
    log.info(serviceProducerService.author());
    log.info(serviceProducerService.description());
    log.info(serviceProducerService.studentIntro());
    log.info(serviceProducerService.teacherIntro());
  }
}



