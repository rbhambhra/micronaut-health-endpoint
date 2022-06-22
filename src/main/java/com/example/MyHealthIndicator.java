package com.example;

import io.micronaut.core.async.publisher.Publishers;
import io.micronaut.health.HealthStatus;
import io.micronaut.management.health.indicator.HealthIndicator;
import io.micronaut.management.health.indicator.HealthResult;
import jakarta.inject.Singleton;
import org.reactivestreams.Publisher;

@Singleton
public class MyHealthIndicator
    implements
    HealthIndicator
{
  @Override
  public Publisher<HealthResult> getResult()
  {
    return Publishers.just(HealthResult.builder("myapp").status(HealthStatus.DOWN).build());
  }
}
