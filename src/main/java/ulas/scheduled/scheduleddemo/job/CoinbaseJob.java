package ulas.scheduled.scheduleddemo.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Slf4j
public class CoinbaseJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("Coin base Job Çalıştı. ACTIVE THREAD COUNT: " +
                Thread.activeCount()+ " "+ "||||| "+ Thread.currentThread().getName());
    }
}
