package com.yolgun.echo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Echo {
  @GetMapping("/{in}")
  public static String echo(@PathVariable String in) {
    log.info("Received {}", in);
    return in;
  }
}
