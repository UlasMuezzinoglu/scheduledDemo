package ulas.scheduled.scheduleddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulas.scheduled.scheduleddemo.info.TimerInfo;
import ulas.scheduled.scheduleddemo.job.CoinbaseJob;

import javax.annotation.PostConstruct;

@Service
public class BusinessService {
    @Autowired
    private SchedulerService scheduler;

    @PostConstruct
    public void runCoinBaseJob() {
        final TimerInfo info = new TimerInfo();
        info.setTotalFireCount(5); //kaç defa çalışacak
        info.setRemainingFireCount(info.getTotalFireCount());
        info.setRepeatIntervalMs(2000); // kaç saniye de bi çalışacak
        info.setRunForever(true); // sonsuza kadar çalışsın mı ? total fire count'u ezer

        scheduler.schedule(CoinbaseJob.class, info);
    }
}
