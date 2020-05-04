/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.time.Instant;
import java.util.Calendar;

/**
 *
 * @author wesll
 */
public class Time {
    private int min;
    private int hour;
    private int sec;
    public Time() {
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(java.util.Date.from(Instant.now()));
        this.hour = c.get(Calendar.HOUR);
        this.min = c.get(Calendar.MINUTE);
        this.sec = c.get(Calendar.SECOND);
    }

    public Time(int min, int hour, int sec) {
        this.min = min;
        this.hour = hour;
        this.sec = sec;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return the sec
     */
    public int getSec() {
        return sec;
    }

    /**
     * @param sec the sec to set
     */
    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public void advance(int h, int m, int s){
        this.hour = h;
        this.min = m;
        this.sec = s;
    }
    public void reset(int h, int m, int s){
        
    }
    
}
