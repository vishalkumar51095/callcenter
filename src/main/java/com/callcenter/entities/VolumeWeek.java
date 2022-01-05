package com.callcenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name = "sample_data")
public class VolumeWeek {
    @Id
    private Long weekday;
    @Column(name = "noofcalls", nullable = false)
    private int noofcalls;

    public VolumeWeek() {
    }

    @Override
    public String toString() {
        return "VolumeWeek{" +
                "weekday=" + weekday +
                ", noofcalls=" + noofcalls +
                '}';
    }

    public VolumeWeek(Long weekday, int noofcalls) {
        this.weekday = weekday;
        this.noofcalls = noofcalls;
    }

    public Long getWeekday() {
        return weekday;
    }

    public void setWeekday(Long weekday) {
        this.weekday = weekday;
    }

    public int getNoofcalls() {
        return noofcalls;
    }

    public void setNoofcalls(int noofcalls) {
        this.noofcalls = noofcalls;
    }
}
