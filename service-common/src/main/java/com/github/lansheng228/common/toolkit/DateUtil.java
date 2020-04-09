package com.github.lansheng228.common.toolkit;

import java.time.Clock;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateUtil {
  private static Clock clock = Clock.systemDefaultZone();

  public static long currentTimeMillis() {
    return clock.millis();
  }
}
