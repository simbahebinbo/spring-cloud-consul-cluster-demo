package com.github.lansheng228.producer.service;


import java.util.Map;

public interface HiService {

  String postHi(String name, Map<Object, Object> payload);

  String getHi(String name);
}


