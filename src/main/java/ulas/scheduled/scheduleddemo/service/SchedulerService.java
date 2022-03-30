package ulas.scheduled.scheduleddemo.service;


import lombok.SneakyThrows;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulas.scheduled.scheduleddemo.info.TimerInfo;
import ulas.scheduled.scheduleddemo.util.TimerUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SchedulerService {
    private final Scheduler scheduler;

    @Autowired
    public SchedulerService(final Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @PostConstruct
    @SneakyThrows
    public void init() {
        try {
            scheduler.start();
        } catch (SchedulerException e) {
            System.out.println(e.getMessage());
        }
    }

    @PreDestroy
    public void preDestroy() {
        try {
            scheduler.shutdown();
        } catch (SchedulerException e) {
            System.out.println(e.getMessage());
        }
    }
    public void schedule(final Class  jobClass, final TimerInfo info) {
        final JobDetail jobDetail = TimerUtils.buildJobDetail(jobClass, info);
        final Trigger trigger = TimerUtils.buildTrigger(jobClass, info);

        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            System.out.println(e.getMessage());
        }
    }
}
