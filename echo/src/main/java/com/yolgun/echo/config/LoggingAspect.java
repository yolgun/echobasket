package com.yolgun.echo.config;

import lombok.val;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * I use this aspect usually for development and disable or remove at prod.
 */
@Aspect
@Configuration
//@Profile("dev")
public class LoggingAspect {

  @Around("within(com.yolgun.echo.controller.*)")
  public Object logControllers(ProceedingJoinPoint pjp) throws Throwable {
    val log = LoggerFactory.getLogger(pjp.getTarget().getClass());
    log.info("{} is called: {}", pjp.getSignature().getName(), pjp.getArgs());

    Object result = null;
    try {
      result = pjp.proceed();
      return result;
    } catch (Exception e) {
      log.warn("{} throws: {}", pjp.getSignature().getName(), e);
      throw e;
    } finally {
      log.info("{} returns: {}", pjp.getSignature().getName(), result);
    }
  }
}
