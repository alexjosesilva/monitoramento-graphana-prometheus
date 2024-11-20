package org.example.monitoramentographanaprometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example.controller")
public class MonitoramentoGraphanaPrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoramentoGraphanaPrometheusApplication.class, args);
    }

}
