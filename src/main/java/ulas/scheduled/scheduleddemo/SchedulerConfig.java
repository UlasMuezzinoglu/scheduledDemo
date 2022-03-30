package ulas.scheduled.scheduleddemo;

import org.springframework.context.annotation.Bean;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {
    @Bean
    public Scheduler getScheduler() throws SchedulerException {
        return StdSchedulerFactory.getDefaultScheduler();
    }
}
