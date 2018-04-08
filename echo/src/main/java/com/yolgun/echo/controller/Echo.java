package com.yolgun.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Echo {
  @GetMapping("/{in}")
  public static String echo(@PathVariable String in) {
    return in;
  }
}
