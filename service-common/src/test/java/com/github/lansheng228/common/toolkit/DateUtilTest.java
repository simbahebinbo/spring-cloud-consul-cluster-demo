package com.github.lansheng228.common.toolkit;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.awaitility.Awaitility.await;

public class DateUtilTest {

  @Test
  public void test() {
    long interval = 100L;
    long currentTime = DateUtil.currentTimeMillis();
    await().pollDelay(interval, TimeUnit.MILLISECONDS).until(() -> true);
    long newTime = DateUtil.currentTimeMillis();
    Assertions.assertTrue(newTime - currentTime >= interval);
  }
}

