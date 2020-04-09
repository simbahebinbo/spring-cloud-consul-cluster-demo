package com.github.lansheng228.producer.service;


import java.util.Map;

public interface PressureService {

  String postPressure(long delay, int length, String name, Map<Object, Object> payload);

  String getPressure(long delay, int length, String name);
}


