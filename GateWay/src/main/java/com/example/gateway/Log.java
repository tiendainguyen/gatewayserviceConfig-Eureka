package com.example.gateway;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Log {
  public static final Logger LOGGER = (Logger) LoggerFactory.getLogger(GateWayApplication.class);
  @GetMapping("/getLog")
  public void getLog(){
    Log.LOGGER.trace("this is long");
  }
}
