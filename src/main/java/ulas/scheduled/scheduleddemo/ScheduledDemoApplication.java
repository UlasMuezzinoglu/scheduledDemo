package ulas.scheduled.scheduleddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;

@SpringBootApplication(exclude = {QuartzAutoConfiguration.class})
public class ScheduledDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledDemoApplication.class, args);
    }
}
