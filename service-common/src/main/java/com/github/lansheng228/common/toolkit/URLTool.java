package com.github.lansheng228.common.toolkit;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.github.lansheng228.common.base.CommonConstant;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class URLTool {

  /**
   * 使用标准URL Encode编码。注意和JDK默认的不同，空格被编码为%20而不是+。
   *
   * @param s String字符串
   * @return URL编码后的字符串
   */
  public static String urlEncode(String s) {
    try {
      return URLEncoder.encode(s, CommonConstant.UTF8).replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      throw new IllegalArgumentException("UTF-8 encoding not supported!");
    }
  }

  /**
   * 使用标准URL Encode编码所有参数，并以key1=value1&key2=value2形式返回。
   *
   * @param params Key-Value存储的Map
   * @return URL编码后的字符串
   */
  public static String urlEncode(Map<String, String> params) {
    List<String> list = params.keySet().stream().map(key -> key + CommonConstant.SEPARATOR_EQUAL_SIGN + urlEncode(params.get(key)))
        .collect(Collectors.toList());
    return String.join(CommonConstant.SEPARATOR_AMPERSAND, list);
  }
}

