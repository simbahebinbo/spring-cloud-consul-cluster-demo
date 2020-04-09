package com.github.lansheng228.common.base;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommonConstant {

  public static final String UTF8 = "UTF-8";
  public static final String JSON_TYPE = "application/json;charset=UTF-8";

  public static final String LOCAL_ADDRESS = "localhost";

  /**
   * http方法
   */
  public static final String METHOD_GET = "GET";
  public static final String METHOD_POST = "POST";

  /**
   * 端口
   */
  public static final int WS_PORT = 80;
  public static final int WSS_PORT = 443;

  /**
   * scheme
   */
  public static final String SCHEME_HTTP = "http";
  public static final String SCHEME_HTTPS = "https";
  public static final String WS_SCHEME = "ws";
  public static final String WSS_SCHEME = "wss";
  public static final String LB_SCHEME = "lb";

  /**
   * 分隔符
   */
  public static final String SEPARATOR_SEMICOLON = ";";

  public static final String SEPARATOR_QUESTION_MARK = "?";

  public static final String SEPARATOR_COLON = ":";

  public static final String SEPARATOR_COLON2 = "::";

  public static final String SEPARATOR_COMMA = ",";

  public static final String SEPARATOR_AMPERSAND = "&";

  public static final String SEPARATOR_EQUAL_SIGN = "=";

  public static final String SEPARATOR_BLANK = "";

  public static final String SEPARATOR_ASTERISK = "*";


  /**
   * 斜线
   */
  public static final String SEPARATOR_VIRGULE = "/";

  /**
   * 竖线
   */
  public static final String SEPARATOR_VERTICAL_LINE = "|";

  /**
   * 下划线
   */
  public static final String SEPARATOR_UNDERSCORE = "_";

  /**
   * 连字符 中横线
   */
  public static final String SEPARATOR_HYPHEN = "-";
}
