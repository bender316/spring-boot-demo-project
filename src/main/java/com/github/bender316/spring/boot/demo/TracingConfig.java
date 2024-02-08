package com.github.bender316.spring.boot.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.opentelemetry.exporter.logging.LoggingSpanExporter;
import io.opentelemetry.sdk.trace.export.SpanExporter;

@Configuration
public class TracingConfig {

    @Bean
    SpanExporter spanExporter() {
        return LoggingSpanExporter.create();
    }
}
