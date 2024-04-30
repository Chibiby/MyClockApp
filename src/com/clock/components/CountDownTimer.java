package com.clock.components;

import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    private final long totalTime;
    private final long interval;
    private long remainingTime;
    private Timer timer;

    public CountDownTimer(long totalTime, long interval) {
        this.totalTime = totalTime;
        this.interval = interval;
        this.remainingTime = totalTime;
        this.timer = null;
    }

    public void start() {
        if (timer == null) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    remainingTime -= interval;
                    if (remainingTime >= 0) {
                        onTick(remainingTime);
                    } else {
                        onFinish();
                        stop();
                    }
                }
            }, interval, interval);
        }
    }

    public void stop() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
    public void reset() {
    stop();
    remainingTime = totalTime;
    onTick(remainingTime);
}
    public long getRemainingTime() {
        return remainingTime;
    }

    public void onTick(long millisUntilFinished) {
        // implement this method to update the UI on each tick
    }

    public void onFinish() {
        // implement this method to update the UI when the timer finishes
    }
}
