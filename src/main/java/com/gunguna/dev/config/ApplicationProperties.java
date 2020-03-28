package com.gunguna.dev.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Gunguna Dev.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
