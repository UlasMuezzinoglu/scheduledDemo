package ulas.scheduled.scheduleddemo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TimerInfo implements Serializable {
    private int totalFireCount;
    private int remainingFireCount;
    private boolean runForever;
    private long repeatIntervalMs;
    private long initialOffsetMs;
    private String callbackData;
}
