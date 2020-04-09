package com.github.lansheng228.common.toolkit;


import java.util.UUID;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import com.github.lansheng228.common.base.CommonConstant;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GUIDUtil {

  public static String generate() {
    UUID uuid = UUID.randomUUID();
    return uuid.toString().replaceAll(CommonConstant.SEPARATOR_HYPHEN, CommonConstant.SEPARATOR_BLANK);
  }
}
