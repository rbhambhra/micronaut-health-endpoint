package com.example;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.annotation.Filter;
import io.micronaut.management.endpoint.health.HealthEndpoint;
import io.micronaut.management.endpoint.health.filter.HealthResultFilter;

@Filter("/**/health")
@Requires(env = "myfilter")
public class MyHealthResultFilter extends HealthResultFilter
{
  protected MyHealthResultFilter(HealthEndpoint healthEndpoint)
  {
    super(healthEndpoint);
  }

}
