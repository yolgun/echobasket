package com.yolgun.echo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("echo")
@Slf4j
public class Echo {
  @GetMapping("/{in}")
  public String echo(@PathVariable String in) {
    return in;
  }
}
