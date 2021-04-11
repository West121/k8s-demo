package com.west.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello api
 *
 * @author west
 * @date 2021-04-07 15:30
 */
@Slf4j
@RestController
public class HelloController {

  @Value("${server.port}")
  private String port;

  @GetMapping("/hello")
  public String hello() {
    return "hello：" + port;
  }
}
