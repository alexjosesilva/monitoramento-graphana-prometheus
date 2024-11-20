package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {
    @GetMapping("/status")
    public String getStatus() {
        return "API is running smoothly!";
    }

    @GetMapping("/metrics")
    public String getCustomMetric() {
        // Exemplo de uma métrica personalizada
        return "Custom metrics endpoint reached!";
    }
}
