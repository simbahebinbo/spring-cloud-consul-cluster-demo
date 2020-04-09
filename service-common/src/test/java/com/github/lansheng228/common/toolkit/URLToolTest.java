package com.github.lansheng228.common.toolkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class URLToolTest {

  @Test
  public void testUrlEncode() {
    String s = URLTool.urlEncode("A B C XYZ.com中文");
    Assertions.assertEquals("A%20B%20C%20XYZ.com%E4%B8%AD%E6%96%87", s);
  }
}
