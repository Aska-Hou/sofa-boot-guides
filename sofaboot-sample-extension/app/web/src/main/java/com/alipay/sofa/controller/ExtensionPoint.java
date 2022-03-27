package com.alipay.sofa.controller;

import com.alipay.sofa.healthcheck.core.HealthChecker;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author Aska
 * @description Function Description
 * @create 2022/3/27 15:22
 */
@Component
public class ExtensionPoint implements HealthIndicator {
    @Override
    public Health health() {
        Health health = Health.unknown().build();
        return health;
    }
}
